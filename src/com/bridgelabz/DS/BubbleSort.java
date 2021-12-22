package com.bridgelabz.DS;

/*
 * Bubble Sort
 */
public class BubbleSort {

	public static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {
				if (array[j - 1] > array[j]) {
					// Code to swap the elements
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int array[] = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9, 11 };
		System.out.println("Array List is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		
		// Array after bubble sort
		bubbleSort(array);
		System.out.println("Array after applying Bubble Sort: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
