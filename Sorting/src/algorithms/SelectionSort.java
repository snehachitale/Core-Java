package algorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[10];
		int temp=0, min;
		
		System.out.println("Enter length of an array:");
		int n = s.nextInt();
		System.out.println("Enter an array of numbers:");
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
	
		for(int i=0; i<n; i++) {
			min = i;
			for(int j=i+1; j<n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}	
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		System.out.println("Sorted array:");
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
}
