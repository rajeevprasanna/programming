package arrays;

public class MissingNumberInSequence {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 6, 3, 7, 8 };

		int xorValue = 0;
		for (int i = 1; i <= a.length + 1; i++) {
			xorValue = xorValue ^ i;
		}

		for (int i = 0; i < a.length; i++) {
			xorValue = xorValue ^ a[i];
		}
		System.out.println("Missing number is => " + xorValue);
	}
}
