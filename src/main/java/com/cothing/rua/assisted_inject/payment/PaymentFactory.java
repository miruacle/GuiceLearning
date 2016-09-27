package com.cothing.rua.assisted_inject.payment;

public interface PaymentFactory {

	public Payment create(Date startDate, Money amount);
}
