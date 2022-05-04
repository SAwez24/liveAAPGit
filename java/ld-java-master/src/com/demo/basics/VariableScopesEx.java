package com.demo.basics;

public class VariableScopesEx {
public static void main(String[] args) {
	Test test = new Test();
	System.err.println(test.x);
	System.err.println(test.x);
}
}


class Test {
//	instance scope
	// initialized by default constructor
	int x;
	public void test() {
		// local scope are not initialized
		int x;
		// local scope
//		The local variable x may not have been initialized
		x = 100;
		System.out.println(x);
		// instance scope var
		System.err.println(this.x);
	}
}