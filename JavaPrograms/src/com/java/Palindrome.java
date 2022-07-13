package com.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();
		
		if(s.equals(rev)) {
			System.out.println("Entered string is palindrome!");
		} else {
			System.out.println("Entered string is not palindrome!");
		}
	}
}
