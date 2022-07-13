package com.java;

import java.util.ArrayList;
import java.util.List;

class Employee {
	int eId;
	String eName;
	double salary;
	
	public Employee(int eId, String eName, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	
}
public class StreamAPI {

	public static void main(String[] args) {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1, "John", 100000));
		e.add(new Employee(1, "Sean", 700000));
		e.add(new Employee(1, "Tom", 50000));
		e.add(new Employee(1, "Jenny", 40000));
		e.add(new Employee(1, "Rhea", 60000));
		e.add(new Employee(1, "Ronn", 65000));
		
		List<Double> emp = new ArrayList<Double>();
		
		for(Employee em : e) {
			if(em.salary > 50000) {
				emp.add(em.salary);
			}
		}
		System.out.println(emp);
	}
}
