package com.cg.ca.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class E3 {
	public static int getsorted(int[] inputOfArray) {
		int arrayLength = inputOfArray.length;
		int[] outputOfArray = new int[inputOfArray.length];
		for (int i = 0; i < arrayLength; i++) {
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(Integer.toString(inputOfArray[i]));
			stringBuffer.reverse();

			outputOfArray[i] = Integer.parseInt(stringBuffer.toString());
		}
		Arrays.sort(outputOfArray);
		for (int j : outputOfArray) {
			System.out.print(j + " ");
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count= sc.nextInt();
		int z[] = new int[count];
		for(int i=0;i<z.length;i++) {
			int a = sc.nextInt();
			z[i]=a;
		}

		getsorted(z);
		sc.close();

	}

}
