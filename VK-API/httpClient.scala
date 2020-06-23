package com.vk.examlpe

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import scala.io

object test {
  def main(args: Array[String]): Unit ={
  val httpClient = HttpClients.createDefault()
  
  //val url = "https://httpbin.org/post" //https://httpbin.org/post?q=something
  val url = "https://api.vk.com/method/newsfeed.search"
  //val url = "https://api.vk.com/method/newsfeed.search?q=trump&count=3&access_token=4669846987e17187498e5e602718125f9e1ee&v=5.101"
  val httpGet = new HttpGet(url) 
  
  val httpPost = new HttpPost(url)
  //val httpPost = new HttpPost("https://api.vk.com/method/newsfeed.search")
  
  //val json_body = """{"q":"trump", "v":"5.101", "access_token":"4", "count":"3"}""""
  val json_body = """{"q":"trump", "v":"5.52", "access_token":"4", "count":"3"}"""
    
  val entity = new StringEntity(json_body,"UTF-8")
  
  httpPost.setEntity(entity)
  httpPost.setHeader("Content-type", "application/json");
  
  //val r = httpClient.execute(httpPost)
  //val result = EntityUtils.toString(r.getEntity)
  
  postContent(url,json_body)
   
  }
  
  def getRestContent(url:String): String = {
    val httpClient = HttpClients.createDefault()
    val httpResponse = httpClient.execute(new HttpGet(url))
    val entity = httpResponse.getEntity()
    
    var content = ""
    
    if (entity != null) {
      val inputStream = entity.getContent()
      content = io.Source.fromInputStream(inputStream).getLines.mkString
      inputStream.close
    }
    httpClient.getConnectionManager.shutdown()
    
    return content
  }
    
  
  def postContent(url:String , jsonString:String): Unit = {
    val post = new HttpPost(url) 
    post.setHeader("Content-type", "application/json")
    post.setEntity(new StringEntity(jsonString))
    
    val httpClient = HttpClients.createDefault()
    val response = httpClient.execute(post)
 
    println("==========Headers==========")
    response.getAllHeaders.foreach(arg => println(arg))
    println("==========Content==========")
    println(EntityUtils.toString(response.getEntity))
    
  }
 
}
