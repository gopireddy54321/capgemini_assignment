package com.cg.ca.lab3;

public class E2 {

	private static String getImage(String inputString) {
		String string = inputString;
		StringBuffer stringBuffer = new StringBuffer(inputString);
		return string + "|" + stringBuffer.reverse();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getImage("Thejesh"));
	}

}
