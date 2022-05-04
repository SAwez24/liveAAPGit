package com.demo.exception;

import java.util.Scanner;

public class UnhandledExceptionEx {
	public static void main(String[] args) {
		System.err.println("Unhandled Exception");
		int num1, num2;
		int result;
		Scanner scanner = new Scanner(System.in);
		String num1String = scanner.nextLine();
		scanner = new Scanner(System.in);
		String num2String = scanner.nextLine();
		// unhandled exception
		num1 = Integer.parseInt(num1String);
		num2 = Integer.parseInt(num2String);
		result = num1 + num2;
		System.err.println(result);
	}
}
