package arrays;

public class LargestContiguousSubarraySum {
	public static void main(String[] args) {

		int a[] = { -2, -3, 4, -1, 7, -2, 5, -3 };

		int max_sum_here = a[0];
		int max_sum_ending_here = a[0];
		int current_sum = a[0];

		for (int i = 1; i < a.length; i++) {

			if (max_sum_ending_here > max_sum_here) {
				max_sum_here = max_sum_ending_here;
			}

			current_sum = max_sum_ending_here + a[i];

			if (current_sum > max_sum_ending_here) {
				max_sum_ending_here = current_sum;
			} else if (current_sum < max_sum_ending_here) {
				max_sum_ending_here = 0;
			}

		}
		System.out.println("Maximum sum till now is => " + max_sum_here);
	}
}
