package com.demo;


public class CreditCardPayment implements Payment {

	@Override
	public  void pay() {
		System.err.println("Pay using Credit Card");
	}
}
