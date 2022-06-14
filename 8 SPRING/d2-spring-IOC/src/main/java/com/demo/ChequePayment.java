package com.demo;


public class ChequePayment implements Payment {

	@Override
	public  void pay() {
		System.err.println("Pay using Cheque");
	}
}
