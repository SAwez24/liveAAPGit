package com.demo.basics;

public class ASCIIEx {
	public static void main(String[] args) {
//compareStrings();
//		compareStringsManually();
		asciiTable();
	}

	private static void asciiTable() {
		for(int decimal = 0; decimal < 128; decimal ++) {
			char character = (char)decimal;
			System.err.print(character + " > " + decimal + "\t");
		}
	}

	private static void compareStrings() {
		// String nameString = "Anne";
		// String nameString2 = "anne";

		// String nameString = "anne";
		// String nameString2 = "anne";

		// String nameString = "anne";
		// String nameString2 = "annE";

		String nameString = "an$ne";
		String nameString2 = "an#ne";

		int result = nameString.compareTo(nameString2);
		if (result == 0)
			System.err.println("equal");
		else if (result > 0) {
			System.out.println(nameString);
		} else {
			System.err.println(nameString2);
		}
	}

	private static void compareStringsManually() {
//		 String nameString = "Anne";
//		 String nameString2 = "anne";
//
//		String nameString = "anne";
//		String nameString2 = "anne";

		// String nameString = "anne";
		// String nameString2 = "annE";


				String nameString2 = "an#ne";
		String nameString = "an$ne";

		String biggerString = "equal";

		for (int i = 0; i < nameString.length(); i++) {
			if (nameString.charAt(i) > nameString2.charAt(i)) {
				biggerString = nameString;
				break;
			} else if (nameString.charAt(i) < nameString2.charAt(i)) {
				biggerString = nameString2;
			}
		}
		System.err.println(biggerString);
	}
}
