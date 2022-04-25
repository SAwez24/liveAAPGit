package basic.xtra;

public class ArrayCountEvens {
	public static void main(String[] args) {
		// size : 10
//	int[] inputArray = {6, 1, 9, 4, 7, 11, 2, 2, 12, 12};
//	int [] outputArray = {7, 13, 18, 4, 24}
		// size : 9
		int[] inputArray = { 6, 1, 9, 4, 7, 11, 2, 2, 12 };
//	int [] outputArray = {7, 13, 18, 4, 12} 
// use modulus to find if the array is odd or even numbered
		int modulus = inputArray.length % 2;
		int size = (inputArray.length / 2) + modulus;

		int[] outputArray = new int[size];
		for (int i = 0, j = 0; i < inputArray.length && j < size; i = i + 2, j++) {
			if (modulus == 1 && i == inputArray.length - 1) {
				outputArray[j] = inputArray[inputArray.length - 1];
				break;
			} else {
				outputArray[j] = inputArray[i] + inputArray[i + 1];
			}
		}
//	int [] outputArray = {7, 13, 18, 4, 24};
//	System.out.print("{");
		for (int i : outputArray) {
			System.out.print(i + "\t");
		}
//	System.out.print("}");
	}
}