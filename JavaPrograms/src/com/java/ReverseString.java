package com.java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		s = sc.nextLine();
		System.out.println("Reverse string: ");
		for(int i = s.length(); i > 0; i--) {
			System.out.println(s.charAt(i-1));
		}
	}
}
