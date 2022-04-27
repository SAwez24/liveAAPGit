package com.demo.oops;

public class PointCalculatorPointObject {
	public static void main(String[] args) {
		Point point1 = new Point(5, 6);
		Point point2 = new Point(7, 9);
		Point point3 = new Point(0, 0);

		point3.x = point1.x + point2.x;
		point3.y = point1.y + point2.y;

		System.out.println("Calculated Point : " + point3.x + " " + point3.y);
	}
}

// x & y
class Point {
	// instance variables
	public int x;
	public int y;

	Point(int px, int py) {
		x = px;
		y = py;
	}

//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
}