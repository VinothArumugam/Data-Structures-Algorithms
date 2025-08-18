package com.dsa.maths;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(isPrime(num));
	}

	private static boolean isPrime(int num) {
		
		if(num < 2) return false;
		
		for(int i = 2; i*i <= num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
