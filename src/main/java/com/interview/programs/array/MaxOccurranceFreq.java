package com.interview.programs.array;

import java.util.*;

/**
 * 
 * @author Bhuvaneswari.V
 * program: find the number of integer occurance in array, 
 * if frequency repeated return max number of array
 *
 */
public class MaxOccurranceFreq {

	public static void main(String[] args) {

		Integer[] intArray = { 10, 20, 20, 20, 30, 30, 40,30 };

		// in java 8
		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		intList.stream().forEach(chr -> { 
			map.put(chr, map.getOrDefault(chr, 0)+1);
		});

		Set<Integer> s1 = new HashSet<>();
		Integer value = map.values().stream().max(Integer::compare).get();
		map.entrySet().stream().forEach(entry -> {
			if (value == entry.getValue())
				s1.add(entry.getKey());
		});
		if (s1.size() == 1) {
			System.out.println("Maximum occuring integer is===");
			s1.stream().forEach(System.out::println);
		} else {
			Integer max = map.keySet().stream().max(Integer::compare).get();
			System.out.println("Maximum integer is===" + max);
		}

	}

}
