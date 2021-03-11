package com.cg.ca.lab1;

import java.util.Scanner;
public class E7 {
	static Boolean checkNumber(int n) {
		int temp=n%10;
		while(n>0) {
			int r=n%10;
			if (!(r<=temp)){
				return false;
			}
			n-=r;
			n/=10;
			temp=r;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		System.out.println(checkNumber(n));
		s.close();
	}

}