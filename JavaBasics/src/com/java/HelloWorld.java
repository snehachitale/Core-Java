package com.java;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int flag = 0;
		if(num == 0 || num == 1) {
			System.out.println("Not prime");
		}
		else {
			for(int i=2; i<num; i++) {
				if(num % i == 0) {
					System.out.println("Not prime");
					flag = 1;
				} 
			}
		}
		
		if(flag == 0) {
			System.out.println("Prime");
		}
	}
}
