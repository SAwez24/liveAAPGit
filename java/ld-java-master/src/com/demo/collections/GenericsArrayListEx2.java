package com.demo.collections;

import java.util.ArrayList;

public class GenericsArrayListEx2 {
	public static void main(String[] args) {
		//static methods can be directly called inside main.
		booksArrayList();
	}

	private static void booksArrayList() {
		// arrays : fixed size / similar datatypes / indexed
		// creating an ArrayList / variable size / different datatypes / indexed
		ArrayList<Book> arrayList  = null;
//		init size with 3 elements 
// generic type / allows a spefified type
		arrayList = new ArrayList<Book>();
//		assign elements
//		The method add(Book) in the type ArrayList<Book> is not applicable for the arguments (boolean)
//		arrayList.add(25.5f);
		Book book = new Book("978-0670923175", "Simon Sinek", 369);
		arrayList.add(book);
		book = new Book("978-0670923555", "Ekhart Tolle", 369);
		arrayList.add(book);
		// all object
//		System.err.println(arrayList);

		Book book2 = (Book)arrayList.get(0);
		book2.getDetails();
		book2 = (Book)arrayList.get(1);
		book2.getDetails();
	}
}
