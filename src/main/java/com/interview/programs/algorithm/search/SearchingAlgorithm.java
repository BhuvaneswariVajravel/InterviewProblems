package com.interview.programs.algorithm.search;

import java.util.Arrays;

public interface SearchingAlgorithm {

	public static void main(String[] arg) {
		String str = "searching";
		int[] arr = { 10, 2, 3, 5, 10, 23, 4, 7, 1 };
		int[][] twoDarr = { { 2, 5, 10 }, { 9, 2, 3, 4, 5 }, { 33, 11, 2, 1 } };

		// Linear Search
		linearSearch(arr, twoDarr, str);

		int[] sortedArray = { 0, 1, 2,40,23,55,60, 3, 5, 6, 8, 9, 20, 30 };
		binarySearch(sortedArray);

	}

	static void linearSearch(int[] arr, int[][] twoDarr, String str) {
		// String
		System.out.println("LinearSearch for find char e " + LinearSearch.find(str, 'e'));
		System.out.println("LinearSearch for contains of char e " + LinearSearch.contains(str, 'e'));

		// ID array
		System.out.println("LinearSearch for find 5 " + LinearSearch.find(arr, 5));
		System.out.println("LinearSearch for contains of  5 " + LinearSearch.contains(arr, 5));
		System.out.println("LinearSearch for max  " + LinearSearch.max(arr, 0, arr.length));
		System.out.println("LinearSearch for min " + LinearSearch.min(arr, 0, arr.length));

		// 2D array
		int[] result = LinearSearch.find(twoDarr, 4);
		System.out.println("LinearSearch for find 4 in 2D array is  " + Arrays.toString(result));
		System.out.println("LinearSearch for contains of  5 in 2D array is " + LinearSearch.contains(twoDarr, 5));
		System.out.println("LinearSearch for max in 2D array is " + LinearSearch.max(twoDarr, 0, twoDarr.length));
		System.out.println("LinearSearch for min in 2D array is " + LinearSearch.min(twoDarr, 0, twoDarr.length));

		/**
		 * 
		 * Ref: leetcode
		 * 
		 * 
		 * 3. count number of r in string str 4.count the 4 digit element in arr
		 * [324,2356,322,54433,3445]
		 * 
		 * 
		 * 
		 */

	}

	static void binarySearch(int[] arr) {
		Arrays.sort(arr);
		System.out.println(
				"BinarySearch for find 6 in asc array " + Arrays.toString(arr) + " is " + BinarySearch.find(arr, 20));
		for (int i = 0; i < arr.length / 2; i++) {
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
		System.out.println("BinarySearch for find 30 in dec array "+Arrays.toString(arr)+" is "+BinarySearch.find(arr,30));
	}
}
