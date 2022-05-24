package com.demo.package1;

public class ClassB {
	public static void main(String[] args) {
		ClassA classA = new ClassA();
//		The field ClassA.privateVar is not visible
//		System.err.println(classA.privateVar);
//		The method privateMethod() from the type ClassA is not visible
//		classA.privateMethod();
		
		System.err.println(classA.defaultVar);
		classA.defaultMethod();
		
		System.err.println(classA.protectedVar);
		classA.protectedMethod();
		
		System.err.println(classA.publicVar);
		classA.publicMethod();
	}
}
