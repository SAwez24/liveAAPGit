package com.demo.basics;

public class VariableScopesEx {

}


class Test {
//	instance scope
	// initialized by default
	int x;
	public void test() {
		// local scope
		int x;
		// local scope
		System.out.println(x);
		// instance scope var
		System.err.println(this.x);
	}
}