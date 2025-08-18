package com.dsa.maths;

public class IsPerfectNumber {

	/*
	 * You are given an integer n. You need to check if the number is a perfect
	 * number or not. Return true if it is a perfect number, otherwise, return
	 * false. A perfect number is a number whose proper divisors (excluding the
	 * number itself) add up to the number itself.
	 */
	
	public static void main(String[] args) {
		int num = 36;
		System.out.println(isPerfect(num));
	}

	private static boolean isPerfect(int num) {
		int sum = 1;
		
		for(int i = 2; i*i <= num ; i++) {
			
			if(num%i == 0) {
				sum = sum + i;	
				if(i != (num/i)) sum = sum + (num/i);
			}
		}
		
		return (num == sum);
	}

}
