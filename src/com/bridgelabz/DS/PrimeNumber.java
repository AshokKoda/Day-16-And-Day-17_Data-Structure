package com.bridgelabz.DS;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 100; i++) {
			if (Utility.isPrime(i)) {
				System.out.print(i + " ");
			}
			
		}

	}

}
