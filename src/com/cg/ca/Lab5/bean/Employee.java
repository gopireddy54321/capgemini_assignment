package com.cg.ca.Lab5.bean;

import com.cg.eis.exception.EmployeeException;

public class Employee {
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws EmployeeException {
		if(salary<3000) {
			throw new EmployeeException();
		}
		this.salary = salary;
	}
}
