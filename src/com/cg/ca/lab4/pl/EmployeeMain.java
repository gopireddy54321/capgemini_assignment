package com.cg.ca.lab4.pl;

import java.util.Scanner;

import com.cg.ca.lab4.bean.Employee;
import com.cg.ca.lab4.service.EmployeeServiceImpl;



public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Enter Employee Name : ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		System.out.println("Enter Employee ID");
		Scanner s1 = new Scanner(System.in);
		int id = s1.nextInt();
		
		System.out.println("Enter Employee salary");
		Scanner s2 = new Scanner(System.in);
		double salary = s2.nextDouble();
		
		System.out.println("Enter Employee designation : ");
		Scanner s3 = new Scanner(System.in);
		String designation = s3.nextLine();
		EmployeeServiceImpl empl = new EmployeeServiceImpl();
		Employee e5 = empl.getEmployeeDetails(id, name, salary, designation);
		empl.displayEmployeeDetails(e5);
		System.out.println("Insurance Scheme : "+empl.findInsuranceScheme(e5));
		
	}

}
