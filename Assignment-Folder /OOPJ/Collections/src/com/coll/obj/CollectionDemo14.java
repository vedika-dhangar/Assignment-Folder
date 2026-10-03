package com.coll.obj;

import java.util.ArrayList;

class Employee{
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
	
	
}

public class CollectionDemo14 {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		
		a.add(new Employee(31,"Rama"));
		a.add(new Employee(23,"Shiva"));
		a.add(new Employee(35,"Rahul"));
		a.add(new Employee(41,"Keshav"));
		a.add(new Employee(45,"Amit"));
		a.add(new Employee(32,"Mohan"));
		
		for(Employee e : a) {
			System.out.println(e);
		}
		
	
	}

}
