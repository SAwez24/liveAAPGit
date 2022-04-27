package ocjp;

public class IntToByteEx {
	// default constructor
	public IntToByteEx() {
		// call the IntToByteEx(byte var)
		this((byte)4);
		System.out.println("Default constructor");
//		The constructor IntToByteEx(int) is undefined
//		this(4);
		
	}

	// parameterized constructor
	public IntToByteEx(byte var) {
		System.out.println("Params constructor");
		System.out.println(var);
	}

	public static void main(String[] args) {
		IntToByteEx intToByteEx  = new IntToByteEx();
	}
}