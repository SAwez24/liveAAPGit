package com.demo.package2;

import com.demo.package1.ClassA;

public class ClassC extends ClassA{
	public static void main(String[] args) {
		ClassA classA = new ClassA();
//		The field ClassA.privateVar is not visible
//		System.err.println(classA.privateVar);
//		The method privateMethod() from the type ClassA is not visible
//		classA.privateMethod();
		
//		System.err.println(classA.defaultVar);
//		classA.defaultMethod();
		
//		System.err.println(classA.protectedVar);
//		classA.protectedMethod();		
		ClassC classC = new ClassC();
		System.err.println(classC.protectedVar);
		classC.protectedMethod();
		
		System.err.println(classA.publicVar);
		classA.publicMethod();
	}
}
