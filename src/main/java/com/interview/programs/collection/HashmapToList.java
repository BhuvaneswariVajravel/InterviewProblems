package com.interview.programs.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author Bhuvaneswari.V convert hashmap into array list
 *
 */
public class HashmapToList {
	public static void main(String[] args) {

		HashMap<Integer, String> customerIdNameMap = new HashMap<Integer, String>();
		// Putting key-values pairs in HashMap
		customerIdNameMap.put(1001, "Arman");
		customerIdNameMap.put(1002, "Javin");
		customerIdNameMap.put(1003, "Mat");
		customerIdNameMap.put(1004, "Joe");

		System.out.println("======Before java 8 ====");

		// Before Java 8
		// Convert keys to ArrayList
		List<Integer> customerIdList = new ArrayList<Integer>(customerIdNameMap.keySet());
		System.out.println("customerIds: " + customerIdList);

		// Convert values to ArrayList
		List<String> customerNames = new ArrayList<String>(customerIdNameMap.values());
		System.out.println("Customer Names: " + customerNames);

		// Convert entry objects to ArrayList
		List<Map.Entry<Integer, String>> entryCustomerList = new ArrayList<Map.Entry<Integer, String>>(
				customerIdNameMap.entrySet());
		System.out.println("Customer ID and Names: " + entryCustomerList);

		System.out.println("======java 8 version====");
		// Java 8
		// Convert keys to ArrayList
		List<Integer> customerIdList8 = customerIdNameMap.keySet().stream().collect(Collectors.toList());
		System.out.println("customerIds: " + customerIdList8);

		// Convert values to ArrayList
		List<String> customerNames8 = customerIdNameMap.values().stream().collect(Collectors.toList());
		System.out.println("Customer Names: " + customerNames8);

		// Convert entry objects to ArrayList

		List<Map.Entry<Integer, String>> entryCustomerList8 = customerIdNameMap.entrySet().stream()
				.collect(Collectors.toList());
		System.out.println("Customer ID and Names: " + entryCustomerList8);

	}
}
