package com.cg.ca.lab4.service;

import com.cg.ca.lab4.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public String findInsuranceScheme(Employee emp) {
		double salary = emp.getSalary();
		String designation = emp.getDesignation();
		if(salary >= 20000 && salary <30000 && designation.equals("Analyst"))
			return "Schemee1";
		else if(salary >= 30000 && designation.equals("Analyst"))
			return "Schemee2";
		else if(salary >= 40000 && salary<50000 && designation.equals("Analyst"))
			return "Schemee3";
		else if(salary >= 50000 && designation.equals("Senior Analyst"))
			return "Schemee4";
		else
			return "Schemee5";
	}

	@Override
	public Employee getEmployeeDetails(int id, String name, double salary, String designation) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		emp.setName(name);
		
		emp.setId(id);
		
		emp.setDesignation(designation);
		
		emp.setSalary(salary);
		return emp;	
	 
	}

	@Override
	public void displayEmployeeDetails(Employee emp1) {
		// TODO Auto-generated method stub
		System.out.println("Employee Name : "+emp1.getName());
		System.out.println("Employee ID :"+emp1.getId());
		System.out.println("Employee salary :"+emp1.getSalary());
		System.out.println("Employee designation :"+emp1.getDesignation());
	
	}
	
	
}
