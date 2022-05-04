package com.demo.exception;

public class RaiseExceptionEx {
public static void main(String[] args) {
	int number = -1;
//	number = 1;
	try {
		System.err.println("here now");
		if(number < 0) {
			// checking condition 
			Exception exception = new Exception("The number cannot be less than zero");
			throw exception;
		}
		else {
			System.err.println(number);
		}
	} catch (Exception e) {
		String messageString = e.getMessage();
		System.err.println(messageString);
	}
}
}
