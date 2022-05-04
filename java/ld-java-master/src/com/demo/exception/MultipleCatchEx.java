package com.demo.exception;

public class MultipleCatchEx {
	public static void main(String[] args) {
		Test1 test = null;
		test = new Test1();
		int num1 = 100, num2 = 0;
		int result = 0;
		try {
			System.err.println(test.messageString);
			result = num1 / num2;
		} catch (NullPointerException nullPointerException) {
			System.err.println("NPE : " + nullPointerException.getMessage());
		} catch (ArithmeticException arithmeticException) {
			System.err.println("AE : " + arithmeticException.getMessage());
		}
	}
}

class Test1 {
	public String messageString = "welcome";
}
