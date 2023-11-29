package com.interview.programs.string;

import com.interview.programs.collection.SecondNonRepetingCharJava8;

/**
 * 
 * @author Bhuvaneswari.V
 * 
 *Find second non repeat character from the string
 *Time Complexity :O(N)
 */
public class SecondNonRepeatingCharacter {

	public static void main(String[] args) {
		String str="Saanntthhuuuuukl";
		new SecondNonRepeatingCharacter().findSecondNonRepetedChar(str);
		new SecondNonRepetingCharJava8().findSecondNonRepetedChar(str);
	}
	public void findSecondNonRepetedChar(String str) {
		int count =0;

		for(char i : str.toCharArray()) {
			if(str.indexOf(i)==str.lastIndexOf(i)) {
				if(count==1) {
					System.out.println("Second non repeating char is "+i);
					break;
				}
				count++;
			}
		}
		if(count==1)
			System.out.println("There is no second non repeted character");
				
	}
	
}
