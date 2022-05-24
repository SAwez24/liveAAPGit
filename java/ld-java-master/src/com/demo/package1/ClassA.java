package com.demo.package1;

public class ClassA {
// least accessible private > default > protected > public
// most accessible public > protected > default > private
// private / accessible only inside declared class
// not accessible by other classes in same package
// not accessible in other packages
	private String privateVar = "privateVar";

	private void privateMethod() {
		System.err.println("privateMethod");
	}

	// inside same package // default access
	String defaultVar = "default";

	void defaultMethod() {
		System.err.println("defaultMethod");
	}

	protected String protectedVar = "protectedVar";

	protected void protectedMethod() {
		System.err.println("protectedMethod");
	}
	
	public String publicVar = "publicVar";

	public void publicMethod() {
		System.err.println("publicMethod");
	}

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		System.err.println(classA.privateVar);
		classA.privateMethod();
		System.err.println(classA.defaultVar);
		classA.defaultMethod();
		System.err.println(classA.protectedVar);
		classA.protectedMethod();
		System.err.println(classA.publicVar);
		classA.publicMethod();
	}
}
