package com.dsa.maths;

public class ReverseNumber {
	
//	You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

	public static void main(String[] args) {
		int num = 435;
		
		System.out.println(reverse(num));
	}

	private static int reverse(int num) {
		int reversedNumber = 0;
		while(num > 0) {
			int lastDigit = num%10;
			reversedNumber = reversedNumber*10 + lastDigit;
			num = num/10;
		}
		return reversedNumber;
	}

}
