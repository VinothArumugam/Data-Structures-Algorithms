package com.dsa.maths;

public class ArmstrongNumer {
	
	/*
	 * You are given an integer n. You need to check whether it is an armstrong
	 * number or not. Return true if it is an armstrong number, otherwise return
	 * false. An armstrong number is a number which is equal to the sum of the
	 * digits of the number, raised to the power of the number of digits.
	 */

	public static void main(String[] args) {
		int num = 153;
		System.out.println(isArmstrong(num));
	}

	private static boolean isArmstrong(int num) {
		
		int count = (int) (Math.log10(num)+1);
		int sum = 0;
		int originalNumber = num;
		while(num > 0 ) {
			int lastDigit = num%10;
			sum = sum + (int)(Math.pow(lastDigit, count));
			num = num/10;
		}
		
		return sum == originalNumber;
	}

}
