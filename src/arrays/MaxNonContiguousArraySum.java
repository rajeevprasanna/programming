package arrays;

public class MaxNonContiguousArraySum {
	public static void main(String[] args) {

		int[] a = { 5, 5, 10, 40, 50, 35 };

		// Find max sum such that no consecutive elements contribute to the sum
		int maxSum = a[0];
		int incl_sum = a[0];
		int excl_sum = 0;

		for (int i = 0; i < a.length; i++) {
			maxSum = excl_sum > incl_sum ? excl_sum : incl_sum;
			int tempSum = incl_sum;
			incl_sum = excl_sum + a[i];
			excl_sum = tempSum;
		}
		System.out.println("max sum => " + maxSum);
	}
}
