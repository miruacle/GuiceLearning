package com.cothing.rua.assisted_inject.message;

public interface MessageSender {

	void send(Person recipient, String text);
}
