package com.coll.obj2;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + " " + empName;
	}

	@Override
	public int compareTo(Employee o) {
		return empId - o.empId;

	}

}

public class CollectionDemo16 {
	public static void main(String[] args) {

		TreeSet<Employee> a = new TreeSet<Employee>();

		a.add(new Employee(31, "Rama"));
		a.add(new Employee(23, "Shiva"));
		a.add(new Employee(35, "Rahul"));
		a.add(new Employee(41, "Keshav"));
		a.add(new Employee(45, "Amit"));
		a.add(new Employee(32, "Mohan"));

		for (Employee e : a) {
			System.out.println(e);
		}
	}

}
