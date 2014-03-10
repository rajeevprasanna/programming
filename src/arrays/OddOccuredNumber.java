package arrays;

public class OddOccuredNumber {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 2, 3, 1, 3 };

		// First approach is count each number occureence and then find element
		// wchich occured odd number of times
		// by iterating over the array.

		// Second approach is do xor of all elements of the array. Element which
		// occurs odd number of times will be lft out
		int oddElement = 0;
		for (int i = 0; i < a.length; i++) {
			oddElement = oddElement ^ a[i];
		}
		System.out.println(oddElement);
	}
}
