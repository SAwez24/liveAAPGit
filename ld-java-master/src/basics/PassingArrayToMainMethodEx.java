package basics;

public class PassingArrayToMainMethodEx {
	public static void main(String[] applesArray) {
		System.err.println(applesArray[0]);
		System.err.println(applesArray[1]);
		System.err.println(applesArray[2]);
		// out vs err
		System.out.println("BLACK : INFO");
		System.err.println("RED : ERROR");
	}
}
