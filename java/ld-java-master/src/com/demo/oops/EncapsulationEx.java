package com.demo.oops;

public class EncapsulationEx {
	public static void main(String[] args) {
		// object
//		EncapsulationTest encapsulationTest = new EncapsulationTest();
		// reference
		EncapsulationTest encapsulationTest = null;
//		instance
		encapsulationTest = new EncapsulationTest();
		encapsulationTest.testString = "available outside.....";
		System.out.println(encapsulationTest.testString);

//		The field EncapsulationTest.testString1 is not visible
//		System.out.println(encapsulationTest.testString1);

	}
}

class EncapsulationTest {
	// Not Encap
	public String testString = "not (partially) encapsulated";
	// encapsulated
	private String testString1 = "encapsulated";
}