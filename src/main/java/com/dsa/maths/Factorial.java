package com.dsa.maths;

public class Factorial {
	
	/*
	 * You are given an integer n. Return the value of n! or n factorial. Factorial
	 * of a number is the product of all positive integers less than or equal to
	 * that number.
	 */

	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorial(num));
	}

	private static int factorial(int num) {
		if(num == 0) return 1;
		
		int factorialNumber = 1;
		
		for(int i = 1; i <= num ; i++) {
			factorialNumber = factorialNumber * i;
		}
		
		return factorialNumber;
	}

}
