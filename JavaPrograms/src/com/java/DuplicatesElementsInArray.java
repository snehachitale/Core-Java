package com.java;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesElementsInArray {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
		
		List<Integer> list = new ArrayList<>();
		int i=0;
		while(i<arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		
		for(int index=0; index<arr.length; index++) {
			if(arr[index] != index+1) {
				list.add(arr[index]);
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
