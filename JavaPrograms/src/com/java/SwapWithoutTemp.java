package com.java;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		String a = "Hi";
		String b = "World";
		
		System.out.println("Before swap: " +a+ " " +b);
		a = a+b;
		
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println("After swap: " +a+ " " +b);
		
	}
}
