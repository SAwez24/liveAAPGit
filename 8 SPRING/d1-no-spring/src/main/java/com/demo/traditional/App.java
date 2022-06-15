package com.demo.traditional;

public class App {
	public static void main(String[] args) {
		Payment payment = null;
		if (Math.random() > 0.6) {
			payment = new CreditCardPayment();
		} else if (Math.random() > 0.3) {
			payment = new DebitCardPayment();
		} else if (Math.random() > 0) {
			payment = new ChequePayment();
		}
		payment.pay();
	}
}
