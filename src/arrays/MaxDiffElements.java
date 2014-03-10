package arrays;

public class MaxDiffElements {

	// Find two elements of the array such that larger element appears after the
	// smaller element

	public static void main(String[] args) {
		int a[] = { 80, 2, 6, 3, 100 };
		int smaller = a[0];
		int larger = a[0];
		int maxDiff = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < smaller) {
				smaller = a[i];
			} else if (a[i] > larger) {
				larger = a[i];
				if (maxDiff < (larger - smaller)) {
					maxDiff = larger - smaller;
				}
			}
		}
		System.out.println("Max difference is => " + maxDiff);
	}
}
