package com.interview.programs.algorithm.search;
/**
 * @author Bhuvaneswari.V
 * 
 * Linear Search is part of Sequential search
 * 
 * need to find element in linear manner that is one by one
 *  
 * Time Complexity:
 * Best Time Complexity : O(1)
 * Worst Time Complexity:O(n)
 *
 */
public interface LinearSearch {

	// ===========================String===========================

	/**
	 * 
	 * @param str
	 * @param target
	 * @return
	 */
	public static int find(String str, char target) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target)
				return i;
		}
		return -1;
	}

	/**
	 * 
	 * @param str
	 * @param target
	 * @return
	 */
	public static boolean contains(String str, char target) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target)
				return true;
		}
		return false;
	}

//==========================Array========================
	/**
	 * 
	 * @param arr
	 * @param target
	 * @return
	 */
	public static int find(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

	/**
	 * 
	 * @param arr
	 * @param target
	 * @return
	 */
	public static boolean contains(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return true;
		}
		return false;
	}
	/**
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public static int max(int[] arr,int low,int high) {
		int max=arr[low];
		for(int i=low;i<high;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;		
	}
	/**
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public static int min(int[] arr,int low,int high) {
		int min=arr[low];
		for(int i=low;i<high;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;		
	}
	// =================================2D Array===================

	/**
	 * 
	 * @param twoDarr
	 * @param target
	 * @return
	 */
	public static int[] find(int[][] twoDarr, int target) {
		for (int row = 0; row < twoDarr.length; row++) {
			for (int col = 0; col < twoDarr[row].length; col++) {
				if (twoDarr[row][col] == target)
					return new int[] { row, col };
			}
		}
		return new int[] { -1, -1 };
	}

	/**
	 * 
	 * @param twoDarr
	 * @param target
	 * @return
	 */
	public static boolean contains(int[][] twoDarr, int target) {
		for (int row = 0; row < twoDarr.length; row++) {
			for (int col = 0; col < twoDarr[row].length; col++) {
				if (twoDarr[row][col] == target)
					return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public static int max(int[][] twoDarr,int low,int high) {
		int max=twoDarr[low][low];
		for(int i=low;i<high;i++) {
			for(int j=0;j<twoDarr[i].length;j++) {
			if(twoDarr[i][j]>max)
				max=twoDarr[i][j];
			}
		}
		return max;		
	}
	/**
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public static int min(int[][] twoDarr,int low,int high) {
		int min=twoDarr[low][low];
		for(int i=low;i<high;i++) {
			for(int j=0;j<twoDarr[i].length;j++) {
			if(twoDarr[i][j]<min)
				min=twoDarr[i][j];
			}
		}
		return min;		
	}
}
