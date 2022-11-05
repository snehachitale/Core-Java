package com.java;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int high = 0;
		int nextHigh = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] > high) {
				nextHigh = high;
				high = arr[i];
			} else if(arr[i] > nextHigh) {
				nextHigh = arr[i];
			}
		}
		System.out.println("Highest num: " +high);
		System.out.println("Second highest: " +nextHigh);
	}
}
