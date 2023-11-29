package com.interview.programs.collection;

import java.util.*;

import com.interview.programs.utill.Employee;

/**
 * 
 * @author Bhuvaneswari.V
 * Group employee by department using collection
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

		Map<String,List<Employee>> empR = new HashMap<>();
		List<Employee> value=new ArrayList<>();
		for(Employee e : emp) {
			String key = e.getDept();
			if(!empR.containsKey(e.getDept())) {
				empR.put(key, new ArrayList<>());				
			}
			empR.get(key).add(e);
		}
		empR.entrySet().forEach(System.out::println);
	}

}
