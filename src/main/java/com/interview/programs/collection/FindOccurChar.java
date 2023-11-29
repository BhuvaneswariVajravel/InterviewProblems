package com.interview.programs.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Bhuvaneswari.V find the occurrance of each char in string
 *
 */
public class FindOccurChar {
	public static void main(String[] args) {
		String s = "Programming";
		List<String> chr = new ArrayList<>(Arrays.asList(s.split("")));
		Map<String, Integer> countMap = new HashMap<>();
		chr.forEach(i->{
			countMap.put(i, countMap.getOrDefault(i, 0)+1);
		});	
		countMap.entrySet().forEach(System.out::println);
	}
}
