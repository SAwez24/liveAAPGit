package ocjp;

public class TestStaticInstanceEx {

	// non static method (instance method)
	public void instanceMethod() {
		System.out.println("Non Static Called");
	}

	public static void staticMethod() {
		System.out.println("Static Called");
	}
	public static void main(String[] args) {
		// call static method directly inside another static method
		staticMethod();
//		Cannot make a static reference to the non-static method instanceMethod() 
//		instanceMethod();
		TestStaticInstanceEx instanceEx = new TestStaticInstanceEx();
		instanceEx.instanceMethod();
	}
}
