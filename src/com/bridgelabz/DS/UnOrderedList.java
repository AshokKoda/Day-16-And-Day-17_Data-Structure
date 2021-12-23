package com.bridgelabz.DS;

import java.io.IOException;
import java.util.Scanner;
import com.bridgelabz.handlers.*;

import com.bridgelabz.utility.DSUtility;

public class UnOrderedList {

	public static void main(String[] args) {
		
		DSUtility utility = new DSUtility();
		LinkedList<String> list = new LinkedList<String>();
		String[] strArray = null;
		
		try {
			strArray = utility.readFile(
					"D:/Eclipse Java Projects/eclipse-workspace/Day_16_And_Day_17_DataStructure/src/com/bridgelabz/files/names")
					.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int size = strArray.length;
		for (int i = 0; i < strArray.length; i++) {
			list.add(strArray[i]);
		}
		System.out.println(list.show());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		size = list.searchNode(key, size);
		System.out.println(list.show());
		
		try {
			utility.writeFile(
					"D:/Eclipse Java Projects/eclipse-workspace/Day_16_And_Day_17_DataStructure/src/com/bridgelabz/files/namesoutput",
					list.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
