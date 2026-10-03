package com.coll.obj1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;



class Employee {
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
	public int hashCode() {
		return empId % 10;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			return empId == e.empId;
		}
		return false;

	}

}

public class CollectionDemo15 {

	public static void main(String[] args) {
		HashSet<Employee> a = new HashSet<Employee>();
		
		
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
