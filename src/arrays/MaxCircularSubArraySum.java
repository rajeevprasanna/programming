package arrays;

public class MaxCircularSubArraySum {
	public static void main(String[] args) {
		int[] a = { -1, 40, -14, 7, 6, 5, -4, -1 };
		int original_max_kadane = max_kadane(a);
		int originicalSum = 0;
		for (int i = 0; i < a.length; i++) {
			originicalSum = originicalSum + a[i];
			a[i] = -a[i];
		}
		int invertedMax_kadane = max_kadane(a);

		int final_max_kadane = invertedMax_kadane + originicalSum;
		System.out
				.println(final_max_kadane > original_max_kadane ? final_max_kadane
						: original_max_kadane);
	}

	private static int max_kadane(int[] a) {
		int max_so_far = 0;
		int max_ending_here = 0;
		for (int i = 0; i < a.length; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
			if (max_ending_here > max_so_far) {
				max_so_far = max_ending_here;
			}
		}
		return max_so_far;
	}
}
