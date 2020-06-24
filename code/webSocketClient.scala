package com.vk.examlpe


import java.util.Arrays.asList;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import java.net.URI

object webSocketClient extends App {
  
  
  	val url = "wss://streaming.vk.com/stream?key=2b3bfcdb7214591c0b359cd432c0df50074ba54a"
		
		val client = new EmptyClient(new URI(url));
		
		client.connect();
  
  
  
}

class EmptyClient(uri: URI) extends WebSocketClient(uri) {
  
  	override def onOpen(handshakedata:ServerHandshake ) {
		send("Hello, it is me. Mario :)");
		println("new connection opened");
	}
  	
	
	override def onClose(code:Int,  reason:String,  remote:Boolean) {
		println("closed with exit code " + code + " additional info: " + reason);
	}

	
	override def onMessage(message:String ) {
		println("received message: " + message);
	}

	
	override def onMessage(message:ByteBuffer ) {
		println("received ByteBuffer");
	}

	
	override def onError( ex:Exception) {
		println("an error occurred:" + ex);
	}  	
  	
}
