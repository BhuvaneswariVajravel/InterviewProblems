package com.interview.programs.string;

/**
 * 
 * @author Bhuvaneswari.V
 * 
 *Find first non repeat character from the string
 *Time Complexity :O(N)
 */
public class FirstNonRepeatingChar {

	public static void main(String args[]) {

		String inputStr = "teeter";

		for (char i : inputStr.toCharArray()) {
			if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: " + i);
				break;
			}
		}
	}
}
