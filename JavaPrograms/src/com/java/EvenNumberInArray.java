package com.java;

import java.util.Scanner;

public class EvenNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array elements:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0 ; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Even numbers in given array: ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(" "+arr[i]);
			}
		}
	}
}
