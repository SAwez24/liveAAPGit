package basic;

public class MultipleMainEx {
	public static void main(String[] args) {
		System.out.println("entry point");
		int number[] = { 2, 3 };
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
