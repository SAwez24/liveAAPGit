package com.demo.assorted;
class Pen {
String refill;
// constructors
// same as class name
// special method auto called when creating object (instance) with new keyword
	Pen() {
	// initializing the pen
	refill = "ball point";
	}
	public void write()
	{
		System.out.println("Writing with "  + refill);
	}


}

class Student {
// strating point 
	public static void main(String [] stringArray) {
		// special method auto called when creating object (instance) with new keyword
		Pen parkerPen = new Pen();
		parkerPen.write();
	}
}