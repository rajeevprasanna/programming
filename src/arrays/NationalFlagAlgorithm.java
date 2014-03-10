package arrays;

public class NationalFlagAlgorithm {
	
	public static void main(String[] args) {

		int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int low = 0;
		int mid = 0;
		int high = a.length - 1;

		while (mid <= high) {

			switch (a[mid]) {

			case 0:
				swap(a, low++, mid++);
				break;

			case 1:
				mid++;
				break;

			case 2:
				swap(a, mid, high--);
				break;
			}
		}

		printArray(a);
	}

	private static void swap(int[] a, int low, int high) {
		int temp = a[low];
		a[low] = a[high];
		a[high] = temp;
	}

	private static void printArray(int[] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print("  " + a[i]);
		}
	}
}
