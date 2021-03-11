package com.cg.ca.lab3;

public class E4 {

	private static int modifyNumber(int number) {
		String string = Integer.toString(number);
		String output = "";
		try {
			for (int i = 0; i < string.length(); i++) {
				char char1 = string.charAt(i);
				char char2 = string.charAt(i + 1);
				int number1 = (int) char1;
				int number2 = (int) char2;
				output += Math.abs(number1 - number2);
			}
		} catch (StringIndexOutOfBoundsException e) {
			output += string.substring(string.length() - 1);
		}
		return Integer.parseInt(output);

	}

	public static void main(String[] args) {

		int inputNumber = 150620;
		System.out.println(modifyNumber(inputNumber));
	}

}
