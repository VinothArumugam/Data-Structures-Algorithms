package com.dsa.maths;

public class LargestDigit {

	public static void main(String[] args) {
		int num = 736;
		System.out.println(largeDigit(num));
	}

	private static int largeDigit(int num) {
		int largeDigit = 0;
		while (num > 0) {
			int lastDigit = num%10;
			if(lastDigit > largeDigit) largeDigit = lastDigit;
			num = num/10;
		}
		return largeDigit;
	}
}
