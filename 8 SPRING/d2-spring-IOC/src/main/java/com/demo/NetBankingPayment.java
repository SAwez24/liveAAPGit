package com.demo;

public class NetBankingPayment implements Payment {

	@Override
	public  void pay() {
		System.err.println("Pay using Net Banking");
	}
}
