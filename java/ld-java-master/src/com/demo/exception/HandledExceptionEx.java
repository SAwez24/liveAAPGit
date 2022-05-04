package com.demo.exception;

import java.util.Scanner;

public class HandledExceptionEx
{
	public static void main(String[] args) {
		System.err.println("Unhandled Exception");
		int num1 =0, num2 = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		String num1String = scanner.nextLine();
		scanner = new Scanner(System.in);
		String num2String = scanner.nextLine();
		try {
			// unhandled exception
			num1 = Integer.parseInt(num1String);
			num2 = Integer.parseInt(num2String);
			
		} catch (Exception exception) {
			System.out.println("Operation failed. Try again. Enter only numeric.");
		}
		result = num1 + num2;
		System.err.println("Result : " + result);
	}
}
