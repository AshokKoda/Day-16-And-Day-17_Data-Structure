package com.bridgelabz.DS;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.handlers.LinkedList;
import com.bridgelabz.utility.DSUtility;

public class OrderedList {

	public static void main(String[] args) {
		DSUtility utility = new DSUtility();
		LinkedList<Integer> list = new LinkedList<Integer>();
		String[] strArr = null;
		
		try {
			strArr = (utility.readFile(
					"D:/Eclipse Java Projects/eclipse-workspace/Day_16_And_Day_17_DataStructure/src/com/bridgelabz/files/numbers")
					.split(","));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int[] integerArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			integerArr[i] = Integer.parseInt(strArr[i]);
			list.add(integerArr[i]);
		}
		
		int size = integerArr.length;
		System.out.println(list.show());
		System.out.println("\nSorting");
		list.sort(size);
		System.out.println(list.show());
		
		System.out.println("\nEnter key to search in list:");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		size = list.searchNode(key, size);
		scanner.close();
		
		System.out.println("\nSorting");
		list.sort(size);
		
		System.out.println(list.show());
		String str = list.returnListInString();
		try {
			utility.writeFile(
					"D:/Eclipse Java Projects/eclipse-workspace/Day_16_And_Day_17_DataStructure/src/com/bridgelabz/files/numbersoutput",
					str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
