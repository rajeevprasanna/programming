package arrays;

import java.math.BigInteger;

public class TwoRepeatingElements {
	public static void main(String[] args) {

		// Given array of n+2 elements.
		int[] a = { 4, 2, 4, 5, 2, 3, 1 };
		int n = 5;

		int xor = 0;
		for (int i = 1; i <= n; i++) {
			xor = xor ^ i;
		}

		for (int i = 0; i < a.length; i++) {
			xor = xor ^ a[i];
		}

		// Now we nulled everything except two elements
		// Get the right most set bit in set bit number
		int set_bit_number = xor & ~(xor - 1);

		int x = 0;
		int y = 0;
		for (int i = 0; i < a.length; i++) {
			if (BigInteger.valueOf(a[i]).testBit(set_bit_number)) {
				x = x ^ a[i];
			} else {
				y = y ^ a[i];
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (BigInteger.valueOf(i).testBit(set_bit_number)) {
				x = x ^ i;
			} else {
				y = y ^ i;
			}
		}
		System.out.println("x => " + x + "  y => " + y);
	}
	
	//Approach 2 : traverse across all elements of the array and mark every element as -ve. If u come across any negative element, means it is repeated
}
