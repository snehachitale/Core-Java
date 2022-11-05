package com.java;

public class CodeTest {

	public static void main(String[] args) {
		int[] arr = {4,6,7,8,9,2,3,1};
		
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}			
		}
		
		for(int index = 0; index<arr.length; index++) {
			if(arr[index] != index+1) {
				System.out.println(index+1);
			}
		}
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
