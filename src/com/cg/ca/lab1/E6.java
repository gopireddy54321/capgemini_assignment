package com.cg.ca.lab1;
import java.lang.Math;
import java.util.Scanner;
public class E6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n, n1, n2 = 0, s, s1 = 0, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		n = sc.nextDouble();

		for (double i = 1; i <= n; i++) {
			n1 = Math.pow(i, 2);
			n2 += n1;
		}
		for (double j = 1; j <= n; j++) {
			s = (j * (j + 1)) / 2;
			s1 = Math.pow(s, 2);
		}
		d = s1 - n2;
		System.out.println("the diff is: " + d);
		
		sc.close();
	}

}