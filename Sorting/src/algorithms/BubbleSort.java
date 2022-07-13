package algorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[10];
		int temp=0;
		
		System.out.println("Enter length of an array:");
		int n = s.nextInt();
		System.out.println("Enter an array of numbers:");
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array:");
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
}
