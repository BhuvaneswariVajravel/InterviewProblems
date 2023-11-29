package com.interview.programs.java8;

import java.util.*;
import java.util.stream.*;
/**
 * 
 * @author Bhuvaneswari.V
 * Find the Integer start with one using Stream
 *
 */

public class FindIntegerStartWithOne {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 10, 20, 30, 23, 89, 100, 1000, 120);

		List<Integer> result = list.stream().map(String::valueOf).filter(f -> f.startsWith("1")).map(Integer::parseInt)
				.collect(Collectors.toList());

		System.out.println(result); 

	}

}
