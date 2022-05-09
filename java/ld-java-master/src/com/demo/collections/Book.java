package com.demo.collections;
class Book {
	// instance variables
	private String ISBN;
	private String authorName;
	private int noOfPages;
	public Book(String ISBN, String authorName, int noOfPages) {
//		super();
		this.ISBN = ISBN;
		this.authorName = authorName;
		this.noOfPages = noOfPages;
	}
	
	public void getDetails() {
		System.err.println(ISBN + "\t" + authorName + "\t" + noOfPages);
	}
}