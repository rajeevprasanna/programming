package arrays;

import java.util.Arrays;

public class ArraySum {
	public static void main(String[] args) {
		int[] a = { 1, 4, 45, 6, 10, -8 };
		int sum = 16;

		System.out.println("Printing array before sorting");
		printArray(a);
		// Sort the array and move two pointers from both directions
		Arrays.sort(a);
		System.out.println("Printing array After sorting");
		printArray(a);
		System.out.println();

		// Now start two pointers from both ends. if the sum is greater then you
		// can move right pointer in left direction
		// otherwise move left pointer in right direction
		int left = 0;
		int right = a.length - 1;
		while (left < right) {
			int tempSum = a[left] + a[right];
			if (tempSum == sum) {
				System.out
						.println("We found the two elements which make the required sum. Elements are => "
								+ a[left] + "  " + a[right]);
				break;
			} else if (tempSum < sum) {
				left++;
			} else {
				right--;
			}
		}
	
	
		//Method 2 : use hashmap and retrive elements from there
		//put all the elements ibnto hashmap and iterate over each element to find if the difference from sum element exusts in map
	}
	
	

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print("  " + a[i]);
		}
	}
}
