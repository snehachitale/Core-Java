package com.java;

public class Test {

	static {
		System.out.println("This is Static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("This is Main method");
		
		int arr[] = null;
		if(arr == null  || arr.length == 0) {
			System.out.println("Array is null");
		}
	}
	
	
}
