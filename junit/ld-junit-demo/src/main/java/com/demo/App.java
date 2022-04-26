package com.demo;

public class App {
	public static void main(String[] args) {
		Calculator calculator;
		calculator= new Calculator();
		int result = calculator.add(1, 2);
		System.out.println(result);
		result = calculator.subtract(1, 2);
		System.out.println(result);
	}
}
