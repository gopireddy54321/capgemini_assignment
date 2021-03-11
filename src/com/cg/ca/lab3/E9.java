package com.cg.ca.lab3;

import java.time.LocalDate;
import java.time.Period;

public class E9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate inputDate = LocalDate.of(2019, 2, 12);
		LocalDate inputDate1 = LocalDate.now();
		Period p = Period.between(inputDate, inputDate1);
		System.out.println("Years (Difference in yrs) = " + p.getYears());
		System.out.println("Month (Difference in months) = " + p.getMonths());
		System.out.println("Days (Difference in days) = " + p.getDays());

	}

}
