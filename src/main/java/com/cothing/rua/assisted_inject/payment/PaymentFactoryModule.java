package com.cothing.rua.assisted_inject.payment;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class PaymentFactoryModule extends AbstractModule {

	@Override
	protected void configure() {

		install(new FactoryModuleBuilder().implement(Payment.class, RealPayment.class).build(PaymentFactory.class));

	}

}
