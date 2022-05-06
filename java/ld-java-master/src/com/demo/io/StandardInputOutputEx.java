package com.demo.io;

import java.util.Scanner;

public class StandardInputOutputEx {
	public static void main(String[] args) {
	//	standard input : keyboard
	//  standard output : monitor
	// System.out : monitor
	// System.in : keyboard
		
	System.out.println("standard output");
	Scanner scanner = new Scanner(System.in);
	String fromKeyboardString = scanner.nextLine();
	System.out.println("From Kbd : " + fromKeyboardString);
	}
}
