package arrays;

public class SearchElementInSortedArray {
	public static void main(String[] args) {

		int[] a = { 3, 4, 5, 1, 2 };
		int searchElement = 1;

		// Find the pivot element and divide the array into two sub arrays
		// Now call binary search on appropriate part

	}

	private static int findPivotElement(int[] a, int start, int end) {
		if (end < start)
			return -1;
		if (start == end)
			return start;

		int mid = (start + end) / 2;
		if (mid < end && a[mid] > a[mid + 1]) {
			return mid;
		}
		if (mid > start && a[mid] < a[mid - 1]) {
			return mid - 1;
		}
		if (a[start] >= a[mid])
			return findPivotElement(a, start, mid - 1);
		else
			return findPivotElement(a, mid + 1, end);
	}
}
