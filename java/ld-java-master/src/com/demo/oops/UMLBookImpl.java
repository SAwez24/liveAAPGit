package com.demo.oops;

public class UMLBookImpl {
	public static void main(String[] args) {
		UMLBook umlBook = new UMLBook("Sww", "Simon");
		System.err.println(umlBook.titleString);
		System.err.println(umlBook.authorString);
	}
}
