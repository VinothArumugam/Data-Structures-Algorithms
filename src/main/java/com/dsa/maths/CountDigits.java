package com.dsa.maths;

public class CountDigits {
	
	/*
	 * You are given an integer n. You need to return the number of digits in the
	 * number. The number will have no leading zeroes, except when the number is 0
	 * itself.
	 */

	public static void main(String[] args) {
		int n = 23;
		System.out.println(count(n));
	}

	private static int count(int n) {
		if(n == 0) return 1;
		int count =0;
		while (n > 0) {
			n = n/10;
			count++;
		}
		return count;
	}

}
