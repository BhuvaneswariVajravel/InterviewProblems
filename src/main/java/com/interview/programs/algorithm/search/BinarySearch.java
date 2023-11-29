package com.interview.programs.algorithm.search;
/**
 * 
 * @author Bhuvaneswari.V
 * 
 * Binary search is example of Interval search algorithm.
 * It is specifically designed for searching in sorted data-structures.
 * These type of searching algorithms are much more efficient than Linear 
 * Search as they repeatedly target the center of the search structure and divide the search space in half
 * 
 * Time Complexity:
 * Best Time Complexity: O(1)
 * Worst Time Complexity: O(log2 n)
 *
 */
public interface BinarySearch {

	public static int find(int[] arr,int target){
		
		int start =0;
		int end = arr.length-1;
		boolean asc =true;
		if(arr[start]>arr[end])
			asc=false;

		while(start<=end){
			int mid =(start+end)/2;
			if(target==arr[mid])
				return mid;
			if(asc) {
				if(target>arr[mid])
					start=mid+1;
				else 
					end=mid-1;			
			}else {
				if(target<arr[mid])
					start=mid+1;
				else 
					end=mid-1;	
			}
		}
		return -1;		
	}
}
