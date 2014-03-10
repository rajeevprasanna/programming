package arrays;

public class MaxElementInArrayOfIncAndDec {

	public static void main(String[] args) {
		int[] a = { 8, 1000, 20, 80, 600, 200, 400, 500, 3, 2, 1 };
		int x = findPivot(a, 0, a.length - 1);
		System.out.println("Maximum element in the array => " + x);
	}

	private static int findPivot(int[] a, int low, int high) {

		if (low > high)
			return -1;

		if (low == high)
			return a[low];

		int mid = (low + high) / 2;
		if (mid > 0 && a[mid] < a[mid - 1]) {
			return findPivot(a, low, mid);
		} else if (mid < a.length - 1 && a[mid] < a[mid + 1]) {
			return findPivot(a, mid, high);
		} else {
			return a[mid];
		}

	}
}
