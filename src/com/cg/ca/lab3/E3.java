package com.cg.ca.lab3;

public class E3 {

	private static final String consonants = "bcdfghjklmnpqrstvwxyz";
	

	private static String alterString(String input) {
		char[] inputChar = input.toLowerCase().toCharArray();
	    for (int i = 0; i < inputChar.length; i++) {
	        int index = consonants.indexOf(inputChar[i]);
	        if (index != -1)
	            inputChar[i] = consonants.charAt((index + 1) % consonants.length());
	    }
	    return new String(inputChar);

	}
	

	public static void main(String[] args) {
		System.out.println(alterString("Thejesh"));

	
		
	}
}
