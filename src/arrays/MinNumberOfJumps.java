package arrays;

public class MinNumberOfJumps {
	private static final int INT_MAX = 2323;

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };

		// Given an array of integers where each element represents the maximum
		// number of steps that can be made forward
		// from the element
		int[] jumps = new int[a.length];
		int n = a.length;
		for (int i = 1; i < n; i++) {
			jumps[i] = INT_MAX;
			for (int j = 0; j < i; j++) {
				if (i <= j + a[j] && jumps[j] != INT_MAX) {
					jumps[i] = jumps[j] + 1;
					break;
				}
			}
		}
		System.out.println("min no of jumps => " + jumps[a.length - 1]);
	}
}
