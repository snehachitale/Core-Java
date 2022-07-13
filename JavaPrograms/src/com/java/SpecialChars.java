package com.java;

import java.util.Scanner;

public class SpecialChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		int upper = 0, lower = 0, num = 0, special = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<= 'Z') {
				upper++;
			} else if(ch>='a' && ch<='z') {
				lower++;
			}else if(ch>='0' && ch<='9') {
				num++;
			}else {
				special++;
			}
		}
		System.out.println("Lowercase: " +lower);
		System.out.println("Uppercase: " +upper);
		System.out.println("Number: " +num);
		System.out.println("Special characters: " +special);
	}
}
