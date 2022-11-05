package com.java;

import java.util.Scanner;

public class MaximumNumberOfSubsets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxPoint(n, arr));
	}
	
	public static int maxPoint(int n, int arr[]) {
		int result = 1;
		int sum = 0;
		for(int i=0; i<n; i++) {
			
			int count = 1;
			for(int j=1; j<n; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				sum = count*arr[i];
			}
			System.out.println(sum);
		}
		result += sum;
		return result;
	}
}
