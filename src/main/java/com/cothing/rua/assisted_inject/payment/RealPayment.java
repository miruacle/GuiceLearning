package com.cothing.rua.assisted_inject.payment;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class RealPayment implements Payment {

	private CreditService creditService;
	private AuthService authService; // from the Injector
	private Date startDate; // from the instance's creator
	private Money amount; // from the instance's creator

	@Inject
	public RealPayment(CreditService creditService, // from the Injector
			AuthService authService, // from the Injector
			@Assisted Date startDate, // from the instance's creator
			@Assisted Money amount) // from the instance's creator
	{
		this.creditService = creditService;
		this.authService = authService;
		this.startDate = startDate;
		this.amount = amount;
	}

	public void pay(String price) {

		System.out.println(toString());
	}

	@Override 
	public String toString(){
		return creditService.toString() + authService.toString() + startDate.toString() + amount.toString();
	}
}
