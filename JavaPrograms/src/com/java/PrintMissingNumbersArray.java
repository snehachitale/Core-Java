package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintMissingNumbersArray {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0; i<n; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		
		List<Integer> list = new ArrayList<>(); 
		for(int index = 0; index<arr.length; index++) {
			if(arr[index] != index + 1) {
				list.add(index + 1);
			}
		}
		System.out.println(list);
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
