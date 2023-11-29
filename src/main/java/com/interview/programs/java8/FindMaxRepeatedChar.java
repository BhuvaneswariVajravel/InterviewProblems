package com.interview.programs.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Bhuvaneswari.V 
 * find the maximum repeated char in string
 * using java8
 *
 */
public class FindMaxRepeatedChar {
	public static void main(String[] args) {
		String s = "Programming";
		List<String> chr = new ArrayList<>(Arrays.asList(s.split("")));
		Map<String, Integer> countMap = new HashMap<>();
		chr.stream().forEach(i->{
			countMap.put(i, countMap.getOrDefault(i, 0)+1);
		});	
		Integer max=countMap.values().stream().max(Integer::compare).get();
		Set<String> maxChar = new HashSet<>();
		countMap.entrySet().forEach(e->{
			if(max==e.getValue())
				maxChar.add(e.getKey());
		});
		maxChar.forEach(System.out::println);
	}
}
