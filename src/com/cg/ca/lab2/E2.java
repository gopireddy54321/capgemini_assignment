package com.cg.ca.lab2;

import java.util.Scanner;

public class E2 {

	public static String sortStrings(String inputString) {
		int inputLength;
		if(inputString.length()%2==0)
		{
			inputLength = inputString.length()/2;
		}
		else {
			inputLength = (inputString.length()/2)+1;
		}
		String leftOne = inputString.substring(0, inputLength).toUpperCase();
		String rightOne = inputString.substring(inputLength,inputString.length());
		return leftOne+rightOne;
	}

	public static void main(String[] args) {
		System.out.println("Enter Input String: ");
		Scanner scanner = new Scanner(System.in);
		String inputString1 = scanner.next();
		
		System.out.println(sortStrings(inputString1));
		scanner.close();
		
		
		
	}

}
