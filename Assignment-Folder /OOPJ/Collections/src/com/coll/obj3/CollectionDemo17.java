package com.coll.obj3;

import java.util.Comparator;
import java.util.TreeSet;





class Employee {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + " " + empName;
	}

}

class EmployeeComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empId - o2.empId;
	}
	
}

class EmployeeComparator1 implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
	}
	
}

public class CollectionDemo17 {

	public static void main(String[] args) {
		TreeSet<Employee> a = new TreeSet<Employee>(new EmployeeComparator());

		a.add(new Employee(31, "Rama"));
		a.add(new Employee(23, "Shiva"));
		a.add(new Employee(35, "Rahul"));
		a.add(new Employee(41, "Keshav"));
		a.add(new Employee(45, "Amit"));
		a.add(new Employee(32, "Mohan"));

		for (Employee e : a) {
			System.out.println(e);
		}
		
		System.out.println("-----------------------------------");
		
		a = new TreeSet<Employee>(new EmployeeComparator1());
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
