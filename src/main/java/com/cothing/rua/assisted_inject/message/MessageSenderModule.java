package com.cothing.rua.assisted_inject.message;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class MessageSenderModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(MessageSender.class).to(SocketBasedMessageSender.class);
		install(new FactoryModuleBuilder().build(MessageFactory.class));
	}
	
}
