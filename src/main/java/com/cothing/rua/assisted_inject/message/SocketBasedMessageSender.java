package com.cothing.rua.assisted_inject.message;

public class SocketBasedMessageSender implements MessageSender {

	public void send(Person recipient, String text) {
		System.out.println("Send message:" + text +  " by websocket to :" + recipient.toString());
		
	}

}
