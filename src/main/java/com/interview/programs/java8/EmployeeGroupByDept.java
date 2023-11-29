package com.interview.programs.java8;

import java.util.*;
import java.util.stream.Collectors;

import com.interview.programs.utill.Employee;

/**
 * 
 * @author Bhuvaneswari.V
 * Group employee by department using Java8
 * 
 *
 */
public class EmployeeGroupByDept {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("emp1", 10000, "HR"));
		emp.add(new Employee("emp2", 60000, "HR"));
		emp.add(new Employee("emp3", 70000, "Development"));
		emp.add(new Employee("emp4", 100000, "Development"));
		emp.add(new Employee("emp5", 8000, "Testing"));

		Map<String,List<Employee>> empR = emp.stream().collect(Collectors.groupingBy(Employee::getDept));
		empR.entrySet().forEach(System.out::println);
	}

}
