package com.interview.programs.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.interview.programs.utill.Employee;

/**
 * 
 * @author Bhuvaneswari.V
 * 
 *         Filter Employee whose salary more than 40000
 *
 */
public class FilterEmployee {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("emp1", 10000, "HR"));
		emp.add(new Employee("emp2", 60000, "HR"));
		emp.add(new Employee("emp3", 70000, "Development"));
		emp.add(new Employee("emp4", 100000, "Developement"));
		emp.add(new Employee("emp5", 8000, "Testing"));

		List<Employee> filteredEmployee = emp.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
		System.out.println(filteredEmployee.toString());

	}
}
