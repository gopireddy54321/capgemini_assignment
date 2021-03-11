package com.cg.ca.Lab5.main;

import com.cg.bean.Employee;
import com.cg.eis.exception.EmployeeException; 

public class Exercise3 {

	public static void main(String[] args) {
		 
		Employee emp = new Employee();
		emp.setName("Sai kishore");
		try {
			emp.setSalary(2500);
		} catch (EmployeeException e) {
			 System.out.println(e);
		}
	}

}
