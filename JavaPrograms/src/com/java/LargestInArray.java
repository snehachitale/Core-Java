package com.java;

public class LargestInArray {

	public static void main(String[] args) {
		int arr[] = {10, 324, 45, 90, 980};
		
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("Largest number in given array: " +max);
	}
}
