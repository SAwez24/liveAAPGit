package com.demo.collections;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		//static methods can be directly called inside main.
		objectArrayList();
	}

	private static void objectArrayList() {
		// arrays : fixed size / similar datatypes / indexed
		// creating an ArrayList / variable size / different datatypes / indexed
		ArrayList arrayList  = null;
//		init size with 3 elements 
// raw type / allows different data types and objects
		arrayList = new ArrayList();
//		assign elements
		arrayList.add(25.5f);
		arrayList.add("dell");
		arrayList.add(true);
		Book book = new Book("978-0670923175", "Simon Sinek", 369);
		arrayList.add(book);

		// all object
		System.err.println(arrayList);
		// index
		System.err.println(arrayList.get(0));
		System.err.println(arrayList.get(1));
		System.err.println(arrayList.get(2));
		Book book2 = (Book)arrayList.get(3);
		book2.getDetails();
	}
}
