package com.java;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
			
		System.out.println(findMissing(arr));
	}
	
	static int findMissing(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i];
			if(arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		
		for(int index=0; index<arr.length; index++) {
			if(arr[index] != index) {
				return index;
			}
		}
		return arr.length;
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp; 
	}
}
