package app;

public class PointCalculatorArray {
	public static void main(String[] args) {
		int points1[] = { 5, 6 };
		int points2[] = { 7, 8 };
		int points3[] = { 0, 0 };
		points3[0] = points1[0] + points2[0];
		points3[1] = points1[1] + points2[1];
		System.out.println("Calculated Point : " + points3[0] + " " + points3[1]);
	}
}

