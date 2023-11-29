package com.interview.programs.array;

/**
 * find second duplicate from integer array
 */
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SecondDuplicateInteger {
	public static void main(String[] args) {
		Integer arr[] = { 2, 3, 4, 5, 4, 3, 5, 6, 5, 6 };
		System.out.println("second duplicate::" + duplicate(arr));
	}

	public static Integer duplicate(Integer arr[]) {
		int match = 0;
		int secondDup = 0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		Arrays.stream(arr).forEach(a -> {
			map.put(a, map.getOrDefault(a, 0) + 1);

		});

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				match++;
				if (match == 2) {
					secondDup = entry.getKey();
					break;
				}
			}
		}

		return secondDup;

	}
}
