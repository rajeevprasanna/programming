package arrays;

public class MajorityElement {
	
	public static void main(String[] args) {
		
		int[] a = { 1, 3, 3, 1, 2 };

		// find the majority element using moores voting algorithm
		// Has the counter of majority element and iterate over the array
		// If the next element is same is the majority element you are holding
		// at that position, then increment counter
		// of majority element otherwise decrement
		// when it becomes negative, change the majority element value to
		// current value

		int majorityElementIndex = a[0];
		int counter = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[majorityElementIndex]) {
				counter++;
			} else {
				counter--;
			}
			if (counter == 0) {
				majorityElementIndex = i;
				counter = 1;
			}
		}
		System.out.println("Majority element => " + a[majorityElementIndex]);
	}
}
