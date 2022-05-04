package com.demo.exception;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		
		Test test = null;
//		test = new Test();
		try {
		System.err.println(test.messageString);
		}
		catch (NullPointerException nullPointerException) {
			test = new Test();
			System.err.println(test.messageString);
		}
	}
}

class Test {
	public String messageString = "welcome";
}
