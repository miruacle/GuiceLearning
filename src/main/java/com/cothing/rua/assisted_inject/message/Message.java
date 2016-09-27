package com.cothing.rua.assisted_inject.message;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class Message {

	private String text;
	private MessageSender sender;

	@Inject
	public Message(@Assisted String text, MessageSender sender){
		this.text = text;
		this.sender = sender;
	}
	
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public void send(Person recipient){
		this.sender.send(recipient, this.text);
	}
	
}
