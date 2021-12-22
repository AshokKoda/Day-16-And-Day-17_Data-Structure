package com.bridgelabz.DS;

import java.util.Arrays;

/*
 * Insertion Sort
 */
public class InsertionSort {

	//Insertion function
	public void insertionSort(int[] array) {
		int size = array.length;
		
		for(int i = 1; i < size; i++) {
			int n = array[i];
			int j = i - 1;
			
			//Compare key with each element on the left of 
			//it until an element smaller than
			while (j >= 0 && n < array[j]) {
				array[j + 1] = array[j];
				--j;
			}
			array[j + 1] = n; //Place key at after the element just smaller than it.
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] data = { 2, 6, 4, 9, 8, 5 };
		InsertionSort insert = new InsertionSort();
		insert.insertionSort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));

	}

}
