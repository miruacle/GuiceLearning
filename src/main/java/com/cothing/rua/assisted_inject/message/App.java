package com.cothing.rua.assisted_inject.message;

import com.google.inject.Guice;
import com.google.inject.Inject;

public class App {

	@Inject MessageFactory factory;
	
	public static void main(String[] args){
		App app = Guice.createInjector(new MessageSenderModule()).getInstance(App.class);
		Person p = new Person();
		app.test(p);
	}
	
	public void test(Person recipient){

		Message message = factory.buildMessage("hehe");
		message.send(recipient);
	}
	
}
