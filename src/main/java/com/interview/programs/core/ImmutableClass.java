package com.interview.programs.core;

/**
 * 
 * @author Bhuvaneswari.V
 * Create Immutable class
 * can we clone immutable class - yes we can clone immutable class
 * how to restrict to clone immutable object - we can throw clone not found exception 
 * when we try to clone or we can return the same object using this.
 * 
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class Company implements Cloneable {

	private final String name;
	private final int size;
	private final List<String> emp;

	public Company(String name, int size, List<String> emp) {

		this.name = name;
		this.size = size;
		this.emp = emp.stream().collect(Collectors.toList());
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public List<String> getEmp() {
		return emp;
	}

	public Object clone() throws CloneNotSupportedException {
		// throw new CloneNotSupportedException();
		return this;
	}

}

class ImmutableClass {
	public static void main(String[] args) throws CloneNotSupportedException {

		List<String> emp = new ArrayList<>();
		emp.add("emp1");
		emp.add("emp2");
		emp.add("emp3");

		Company obj = new Company("Company 1", 10000, emp);

		System.out.println("obj hashcode " + obj.hashCode());
// Deep COpy example in immutable class
		emp.add("emp4");
		emp.add("emp5");
		emp.add("emp6");

		System.out.println("====emp===" + obj.getEmp().size());

		obj = new Company("Company 2", 20000, emp);

		System.out.println("obj hashcode " + obj.hashCode());

// cloning in immutable class
		Company obj1 = new Company("Company 2", 20000, emp);

		System.out.println("obj1 hashcode " + obj1.hashCode());

		Company cloneObj = (Company) obj1.clone();

		System.out.println("====cloneObj===" + cloneObj.hashCode());


	}
}
