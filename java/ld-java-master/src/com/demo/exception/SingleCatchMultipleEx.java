package com.demo.exception;

public class SingleCatchMultipleEx {
	public static void main(String[] args) {
		Test21 test = null;
//		test = new Test21();
		int num1 = 100, num2 = 0;
		int result = 0;
		try {
			System.err.println(test.messageString);
			result = num1 / num2;
		} catch (NullPointerException  | ArithmeticException exception) {
			System.err.println("EXCEP : " + exception.getMessage());
		} 
	}
}

class Test21 {
	public String messageString = "welcome";
}
