package arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a = { 2, 8, 0, 0, 0, 13, 0, 15, 20 };
		int[] n = { 5, 7, 9, 25 };
		moveElementsToEnd(a);
		printElement(a);
		mergeTwoArrays(a, 4, n);
		System.out.println();
		printElement(a);
	}

	// Assume array a is larger than array b.
	private static void mergeTwoArrays(int[] a, int aStart, int[] b) {

		int index = 0;
		int aIndexTracker = aStart;
		int bIndexTracker = 0;

		while (index < a.length && aIndexTracker < a.length
				&& bIndexTracker < b.length) {
			if (a[aIndexTracker] > b[bIndexTracker]) {
				a[index] = b[bIndexTracker];
				bIndexTracker++;
			} else if (a[aIndexTracker] < b[bIndexTracker]) {
				a[index] = a[aIndexTracker];
				aIndexTracker++;
			}
			index++;
		}
	}

	private static void moveElementsToEnd(int[] a) {
		int j = a.length - 1;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0) {
				a[j] = a[i];
				j--;
			}
		}
		// Now fill all elements before zero to zero
		boolean fillElementWithZero = false;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == 0) {
				fillElementWithZero = true;
			}
			if (fillElementWithZero) {
				a[i] = 0;
			}
		}
	}

	private static void printElement(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print("  " + a[i] + "  ");
		}
	}
}
