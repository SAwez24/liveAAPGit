package com.demo.traditional;

public class DebitCardPayment implements Payment {

	@Override
	public  void pay() {
		System.err.println("Pay using Debit Card");
	}
}
