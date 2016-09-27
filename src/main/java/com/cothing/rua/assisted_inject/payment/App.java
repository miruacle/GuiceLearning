package com.cothing.rua.assisted_inject.payment;

import com.google.inject.Guice;
import com.google.inject.Inject;

public class App {

	@Inject 
	PaymentFactory factory;
	
	public static void main(String[] args) {
		App app = Guice.createInjector(new PaymentFactoryModule()).getInstance(App.class);
		app.test();
	}
	
	public void test(){
		Payment payment = factory.create(new Date(), new Money());
		payment.pay("hehe!");
		
	}

}
