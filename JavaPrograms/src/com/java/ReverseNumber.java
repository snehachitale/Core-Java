package com.java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		
		while(n > 0) {
			int rem = n % 10;
			n = n / 10;		

			rev = rev * 10 + rem;
		}
		System.out.println(rev);
	}
}
