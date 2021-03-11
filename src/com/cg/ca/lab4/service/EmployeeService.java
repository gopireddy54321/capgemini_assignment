package com.cg.ca.lab4.service;

import com.cg.ca.lab4.bean.Employee;

public interface EmployeeService {

	public Employee getEmployeeDetails(int id,String name,double salary,String designation);
 
	
	public String findInsuranceScheme(Employee emp);
	
	
	
	public void displayEmployeeDetails(Employee emp);

}
