package com.cg.ca.lab3;

import java.util.StringTokenizer;

public class E1 {

	public static void main(String[] args) {

		StringTokenizer stringtokens = new StringTokenizer("1 3 5 7 9");
		int sumOfIntegers = 0;
		int inputNumber;
		while (stringtokens.hasMoreTokens()) {
			inputNumber = Integer.parseInt(stringtokens.nextToken());
			System.out.println(inputNumber);
			sumOfIntegers += inputNumber;
		}

		System.out.println(sumOfIntegers);

	}

}