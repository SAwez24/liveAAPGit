package basics;

public class DataTypesEx {
	public static void main(String[] args) {
		// Type mismatch: cannot convert from int to byte
//		1 = int, 1.1 = double
//		byte byteVar = 128;
		byte byteVar = 127;
		byte byteVar1 = -128;
		short shortVar = 32767;
		int intVar = 2147483647;
//		The literal 9223372036854775807 of type int is out of range 
//		long longMax = 9223372036854775807;
		long longMax = 9223372036854775807L;
//		Type mismatch: cannot convert from double to float
		float floatMax = 3.4028235E38f;
		double doubleMax = 1.7976931348623157E308;
		boolean booleanVar = true;
		char charVar = 'a';
		// ft

		// 8 primitives
		System.out.println("Value Of byte Variable is " + byteVar);
		System.out.println("Value Of short Variable is " + shortVar);
		System.out.println("Value Of int Variable is " + intVar);
		System.out.println("Value Of long Variable is " + longMax);
		System.out.println("Value Of float Variable is " + floatMax);
		System.out.println("Value Of double Variable is " + doubleMax);
		System.out.println("Value Of boolean Variable is " + booleanVar);
		System.out.println("Value Of char Variable is " + charVar);
	}
}
