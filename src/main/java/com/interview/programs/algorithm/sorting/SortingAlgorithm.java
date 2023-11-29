package com.interview.programs.algorithm.sorting;

import java.util.Arrays;

public interface SortingAlgorithm {

	public static void main(String[] args) {
		int arrB[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arrA[] = { 6, 4, 7, 1, 2, 8, 5, 3, 10, 9 };
		int arrW[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//		 selectionSort(arrB);
//		 selectionSort(arrA);
//		 selectionSort(arrW);

//		bubbleSort(arrB);
//		bubbleSort(arrA);
//		bubbleSort(arrW);
//		insertionSort(arrB);
//		insertionSort(arrA);
//		insertionSort(arrW);

		mergeSort(arrB, 0, arrB.length);
		mergeSort(arrA, 0, arrA.length);
		mergeSort(arrA, 0, arrW.length);

		System.out.println("=======arrB====" + Arrays.toString(arrB));
		System.out.println("=======arrA====" + Arrays.toString(arrA));
		System.out.println("=======arrW====" + Arrays.toString(arrW));

	}

	/**
	 * 
	 * @param arr
	 * 
	 *            TimeComplexity: Best, average and worst case time complexity: O(n^2)
	 *            which is independent of distribution of data.
	 * 
	 *            count - 45,45,45
	 */
	public static void selectionSort(int[] arr) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				c++;
				if (arr[j] < arr[index])
					index = j;
			}
			// swap index , i logic
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.println("====" + c);

	}

	/**
	 * 
	 * @param arr TimeComplexity: Average and worst case time complexity: n^2 Best
	 *            case time complexity: n when array is already sorted. 
	 *            count:9,39,45
	 */
	public static void bubbleSort(int[] arr) {
		int c = 0;
		for (int i = 1; i < arr.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - i; j++) {
				c++;
				if (arr[j] > arr[j + 1]) {
					// swap index , i logic
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;

		}
		System.out.println("====" + c);

	}

	/**
	 * 
	 * @param arr TimeComplexity: Best time complexity : O(n) Worst time complexity
	 *            : O(n2) count : 9,25,45
	 */
	public static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				c++;
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else
					break;
			}

		}
		System.out.println("====" + c);
	}

	/**
	 * 
	 * @param arr
	 * 
	 *            It uses divide and conquer and recursive strategy
	 *            
	 *            Space Complexity : O(n)
	 *            
	 *            Time Complexity :
	 *           The Time Complexity of merge sort for Best case, average case and 
	 *           worst case is O(N * logN).
	 */
	public static void mergeSort(int[] arr, int start, int end) {
		if (end - start == 1)
			return;
		int mid = (start + end) / 2;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		merge(arr, start, mid, end);
	}

	/**
	 * 
	 * @param left
	 * @param right
	 * @return
	 * 
	 *         merging the left and right array and return the merged array
	 */
	public static void merge(int[] arr, int start, int mid, int end) {

		int[] joined = new int[end - start];
		int i = start, j = mid, k = 0;
		while (i < mid && j < end) {
			if (arr[i] < arr[j])
				joined[k++] = arr[i++];
			else
				joined[k++] = arr[j++];
		}
		while (i < mid)
			joined[k++] = arr[i++];

		while (j < end)
			joined[k++] = arr[j++];

		for (k = 0; k < joined.length; k++)
			arr[start + k] = joined[k];

	}
}
