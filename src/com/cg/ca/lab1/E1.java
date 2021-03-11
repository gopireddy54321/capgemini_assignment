package com.cg.ca.lab1;

import java.util.Scanner;

public class E1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int digit=sc.nextInt();
		System.out.println("Sum of digits is "+ sumOfDigits(digit));
		
		sc.close();
	}
	public static int sumOfDigits(int n) {
		int result=0;
		int c=0;
		
		while(n>0) {
			result=(n%10);
			c+=(result*result*result);
			n /= 10;
			
		}
		return c;
		
	}

}
