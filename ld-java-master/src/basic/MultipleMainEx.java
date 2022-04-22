package basic;

public class MultipleMainEx {
	public static void main(String[] args) {
		System.out.println("entry point");
		// create / initialize
//		int number[] = { 2, 3 };
		int number[];
		number = new int[2];
		number[0] = 2;
		number[1] = 2;
		
		main(number);
		mainMethod();
	}

	public static void main(int[] args) {
		System.err.println("not the entry point");
		System.err.println(" main(int[] args) ");
		System.err.println(args[0]);
		System.err.println(args[1]);
	}
	
	public static void mainMethod() {
		System.err.println("mainMethod()");
	}
}
