package com.dsa.maths;

public class OddDigits {
	
	/*
	 * You are given an integer n. You need to return the number of odd digits
	 * present in the number. The number will have no leading zeroes, except when
	 * the number is 0 itself.
	 */

	public static void main(String[] args) {
		int num = 12;
		System.out.println(count(num));
	}

	private static int count(int num) {
		int count = 0;
		while(num > 0) {
			int lastDigit = num % 10;
			if(lastDigit%2 == 1) {
				count++;
			}
			num = num/10;
		}
		
		return count;
	}

}
