package com.demo.collections;

public class ArraysEx {
	public static void main(String[] args) {
		//static methods can be directly called inside main.
//		floatArray();
		booksArray();
	}

	private static void floatArray() {
		// arrays : fixed size / similar datatypes / indexed
		// creating an array
		float monitorSizes [] = null;
//		init size with 3 elements 

		monitorSizes = new float[3];
//		assign elements
		monitorSizes[2] = 25.5f;
		monitorSizes[1] = 15.5f;
		monitorSizes[0] = 20.5f;
//		type mismatch: cannot convert from String to float
//		monitorSizes[0] = "welcome";
//		Type mismatch: cannot convert from boolean to float
//		monitorSizes[2] = true;

		for(int i = 0; i<monitorSizes.length; i++) {
			System.err.println(monitorSizes[i]);
		}
	}
	
	private static void booksArray() {
		// arrays : fixed size / similar datatypes / indexed
		// creating an array
		Book1 books [] = null;
//		init size with 3 elements 

		books = new Book1[3];
//		assign elements
//		No enclosing instance of type ArraysEx is accessible. Must qualify the allocation with an enclosing instance of type ArraysEx
		books[2] = new Book1("978-0670923175", "Simon Sinek", 369);
		books[1] = new Book1("978-06709231751", "Simon Sinek1", 3691);
		books[0] = new Book1("978-06709231752", "Simon Sinek2", 3692);
//		type mismatch: cannot convert from String to float
//		monitorSizes[0] = "welcome";
		
		for(int i = 0; i<books.length; i++) {
			books[i].getDetails();
		}
	}
}


