package arrays;

import java.util.Stack;

public class LeadersInArray {
	public static void main(String[] args) {
		// Print all leader elements in array. An element is qualified to be
		// array only if it is greater than elements on its right side

		int[] a = { 16, 17, 4, 3, 31,2 };
		// push all elements into array. and now pop each element check if
		// element is greater than current holding element
		// else print -1
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < a.length; i++) {
			stack.push(a[i]);
		}

		int currentLadder = -1;
		while (!stack.isEmpty()) {
			int currentElement = stack.pop();
			if (currentElement > currentLadder) {
				System.out.println("It is a leader element" + currentElement);
				currentLadder = currentElement;
			}
		}
	}
}
