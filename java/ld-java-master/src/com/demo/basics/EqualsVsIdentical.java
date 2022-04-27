package com.demo.basics;

public class EqualsVsIdentical {
	public static void main(String[] args) {
//	string is immutable	
// string literal
		String company = "ABCCompany";
		String companyName = "ABCCompany";
		
		// you are using this in 1000 places
		// identically
		if(company == companyName ) {
			System.err.println("identical");
		}
		else {
			System.err.println("not identical");
		}
		if(company.equals(companyName)) {
			System.err.println("equal");
		}
		else {
			System.err.println("not equal");
		}

		String companyGlobalName = new String("ABCCompany");
		if(company == companyGlobalName ) {
			System.out.println("identical");
		}
		else {
			System.err.println("not identical");
		}
		if(company.equals(companyGlobalName)) {
			System.err.println("equal");
		}
		else {
			System.err.println("not equal");
		}
		
		String companyNationalName = new String("ABCCompany");
		if(companyGlobalName == companyNationalName ) {
			System.out.println("identical");
		}
		else {
			System.err.println("not identical");
		}
		if(companyGlobalName.equals(companyNationalName)) {
			System.err.println("equal");
		}
		else {
			System.err.println("not equal");
		}
	}
}
