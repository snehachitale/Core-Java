package com.java;

public class Addition {

	int c = 0;
	public int sum(int a, int b) {
		c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		Addition add = new Addition();
		System.out.println("Sum is: " +add.sum(10, 50));
	}
}
