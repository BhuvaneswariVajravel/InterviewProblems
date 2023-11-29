package com.interview.programs.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Bhuvaneswari.V 
 * find the maximum repeated char in string 
 * using collection
 *
 */
public class FindMaxRepeatedChar {
	public static void main(String[] args) {
		String s = "Programming";
		Map<Character, Integer> countMap = new HashMap<>();
		char ch;
		int count=0;
		for(int i=0;i<s.length();i++){
			countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0)+1);
			if(count<countMap.get(s.charAt(i)))
				count=countMap.get(s.charAt(i));
		}
		
		for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
			if(count==entry.getValue())
				System.out.print(entry.getKey()+" ");
		}		
		
	}
}
