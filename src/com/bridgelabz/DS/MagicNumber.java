package com.bridgelabz.DS;

import com.bridgelabz.utility.Utility;

public class MagicNumber {

	public static void main(String[] args) {
		
		int n = Integer.parseInt("3");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		Utility.magicNumber(range);

	}

}
