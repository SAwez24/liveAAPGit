package basics;

public class MainMethodStringArrayEx {
	// get the fruits before entry
	public static void main(String[] args) {

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
}
