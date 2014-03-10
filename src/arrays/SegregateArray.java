package arrays;

public class SegregateArray {
	public static void main(String[] args) {
		int[] a = { 12, 34, 45, 9, 8, 90, 3 };
		int evenTracker = a.length - 1;
		int oddTracker = 0;
		while (oddTracker <= evenTracker) {

			while (a[oddTracker] % 2 == 0)
				oddTracker++;

			while (a[evenTracker] % 2 != 0)
				evenTracker--;

			// swap elements
			int temp = a[oddTracker];
			a[oddTracker] = a[evenTracker];
			a[evenTracker] = temp;
			oddTracker++;
			evenTracker--;

		}
		printArray(a);
	}

	private static void printArray(int[] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print("  " + a[i]);
		}
	}
}
