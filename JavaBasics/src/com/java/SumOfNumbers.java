package com.java;

public class SumOfNumbers {

	public static void main(String[] args) {
		int[] arr = {3, 2, 5, 4, 6};
		int target = 7;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(sum == target) {
					System.out.println("[" +i+ "," +j+ "]");
				}
			}
		}
	}
}
