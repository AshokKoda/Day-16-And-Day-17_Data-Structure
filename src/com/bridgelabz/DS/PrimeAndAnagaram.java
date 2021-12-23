package com.bridgelabz.DS;

import com.bridgelabz.utility.Utility;

public class PrimeAndAnagaram {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		for (int i = 0; i <= 500; i++) {
			if (Utility.isPrime(i)) {
				for (int j = i; j < 500; j++) {
					if (i != j) {
						if (Utility.isPrime(j)) {
							if (utility.isAnagram(String.valueOf(i), String.valueOf(j)) && utility.isPalindrome(i)) {
								System.out.println(i + " " + j + " is prime and anagram and palindrome");
							}
						}
					}
				}
			}
		}

	}

}
