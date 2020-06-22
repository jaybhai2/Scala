package com.vk.examlpe

import collection.JavaConverters._
import com.vk.api.sdk.httpclient.HttpTransportClient
import play.api.libs.json._


import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.client.actors.UserActor
import com.vk.api.sdk.client.TransportClient
import com.vk.api.sdk.objects.wall.WallpostFull

import java.text.SimpleDateFormat
import java.util.Date

object vk {
  def main(args: Array[String]): Unit ={
    
    
    println("hello scala")
    
    val transportClient = new HttpTransportClient()
    
    
    val vkapi = new VkApiClient(transportClient)
    
    val userId = 602382267;
    //service token
		val accessToken = "9420082c9420082c9420082cd29452a493994209420082ccacba98c5c3d94dedc5a2023";
		
		val userActor = new UserActor(userId, accessToken)
		
		
		val start_from:Int = 1592622162
		
		val response = vkapi.newsfeed.search(userActor).extended(true).startTime(start_from).q("protest").count(20).execute.getItems
		
		
		
		val arr = response.toArray()
		val news = arr.map( post =>  {
		  val post_str = post.toString()
		  val post_json = Json.parse(post_str)   
		  val date = post_json.\("date").get
		  val text = post_json.\("text").get
		  
		  val unix_ms:Long = date.toString().toLong * 1000
		  
		  
		  val date_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
		  
		  val datetime = date_format.format(unix_ms)
		  (datetime,unix_ms, text)
		}
		)
		
		val news_sorted = news.sortWith((tup1,tup2) => tup1._2 > tup2._2 )
		
		news_sorted.foreach(println)
		
		//val jsvalue = Json.parse(response)
    
		
		//x.foreach(println)
		//val text_list = jsvalue.\\("date")("text")
		
		//text_list.foreach(println)
		//print(x)
  }

}
