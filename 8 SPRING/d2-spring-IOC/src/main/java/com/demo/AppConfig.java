package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean	
public Payment payment() {
	Payment payment = null;
	if (Math.random() > 0.8) {
		payment = new CreditCardPayment();
	} else if (Math.random() > 0.6) {
		payment = new DebitCardPayment();
	} else if (Math.random() > 0.4) {
		payment = new ChequePayment();
	}
	else if (Math.random() > 0.2) {
		payment = new NetBankingPayment();
	}
	return payment;
}
}
