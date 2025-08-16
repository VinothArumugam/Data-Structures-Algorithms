package com.dsa.maths;

public class PalindromeNumber {
	
	/*
	 * You are given an integer n. You need to check whether the number is a
	 * palindrome number or not. Return true if it's a palindrome number, otherwise
	 * return false. A palindrome number is a number which reads the same both left
	 * to right and right to left.
	 */

	public static void main(String[] args) {
		int num = 453;
		System.out.println(isPolindrome(num));
	}

	private static boolean isPolindrome(int num) {
		
		int reversedNumer = 0;
		int originalNumber = num;
		
		while(num > 0) {
			int lastDigit = num%10; 
			
			reversedNumer = reversedNumer * 10 + lastDigit;
			
			num = num/10;
		}
		
		return reversedNumer == originalNumber;
	}

}
