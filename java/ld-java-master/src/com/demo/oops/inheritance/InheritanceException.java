package com.demo.oops.inheritance;

public class InheritanceException {
	public static void main(String[] args) {
		Base base = new Base();
		// CALLING OR CALLER FUNCTIONS
		try {
			base.test();
		} catch (ArithmeticException | NullPointerException exception) {
			System.out.println("Exception : " + exception);
		}
	}
}

class Base {
	// CALLED FUNCTION
	public void test() throws ArithmeticException, NullPointerException {
		double random = Math.random();
		System.out.println(random);
		if (random > 0.5) {
			int val = 500 / 0;
		} else {
			String nameString = null;
			nameString.charAt(0);
		}
	}

	public void service() throws ArithmeticException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
	}
}

class Derived extends Base {
	@Override
	public void test() {
		int val = 50 / 0;
	}
}
