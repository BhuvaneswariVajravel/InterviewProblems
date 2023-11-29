package com.interview.programs.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author Bhuvaneswari.V
 * 
 *         Find second non repeat character from the string Time Complexity
 *         :O(N) Space complexity : O(N)
 */
public class SecondNonRepetingCharJava8 {

	public void findSecondNonRepetedChar(String str) {
		int count = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				if (count == 1) {
					System.out.println("Second non repeated character is :" + entry.getKey());
					count++;
					break;
				} else
					count++;
			}
		}
		if(count==1)
			System.out.println("There is no second non repeted character");

	}
}
