package com.java;

public class LengthOfString {

	public static void main(String[] args) {
		String str = "sampleString";
		int i = 0;
		for(char c: str.toCharArray()) {
			i++;
		}
		
		System.out.println("Lenght of given string: " +i);
	}
}
