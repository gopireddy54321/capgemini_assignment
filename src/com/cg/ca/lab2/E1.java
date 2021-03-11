package com.cg.ca.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of elements:");
		Scanner sc= new Scanner(System.in);
		int count=sc.nextInt();
		int[] array=new int[count];
		for(int i=0;i<count;i++) {
			array[i]=sc.nextInt();
		}
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]);
		}
		
		Arrays.sort(array);
		System.out.println("The sorted array is:");
		for (int num: array) {
			System.out.print(num+" ");
			
		}
		System.out.println();
		System.out.println("Second Element is"+ array[1]);
		sc.close();

	}

}
