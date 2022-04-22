package basics.extra;

public class MainMethodStringArrayEx {
	// get the fruits before entry
	public static void main(String[] applesArray) {

		System.err.println(applesArray[0]);
		System.err.println(applesArray[1]);
		System.err.println(applesArray[2]);	
		
		fruitsArray();	
		
//		// declare the array
//				String fruitsArray[];
//				// allot memory
//				fruitsArray = new String[3];
//				// initialize
//				fruitsArray[0] = "Mango";
//				fruitsArray[1] = "Banana";
//				fruitsArray[2] = "BlueBerry";
//				fruitsArray(applesArray);
	}	
	// instance method
	// public static ft
	// overloaded 0 args
	public static void fruitsArray() {
		// declare the array
		String applesArray[];
		// allot memory
		applesArray = new String[3];
		// initialize
		applesArray[0] = "Red Apple";
		applesArray[1] = "Green Apple";
		applesArray[2] = "Yellow Apple";
		
		System.err.println(applesArray[0]);
		System.err.println(applesArray[1]);
		System.err.println(applesArray[2]);
	}
	
	//overloading method with same name, but different number / order / type
	// overlaoded 1 args
//	public static void fruitsArray(String[] applesArray) {		
//		System.err.println(applesArray[0]);
//		System.err.println(applesArray[1]);
//		System.err.println(applesArray[2]);
//	}
}
