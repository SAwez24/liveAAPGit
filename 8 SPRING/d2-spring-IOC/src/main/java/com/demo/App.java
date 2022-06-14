package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		Payment payment = null;
//		IOC (Inversion of Control)
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		payment =  (Payment)annotationConfigApplicationContext.getBean("payment");
		payment.pay();
	}
}
