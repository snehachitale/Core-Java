package algorithms;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[10];
		int temp=0, j;
		
		System.out.println("Enter length of an array:");
		int n = s.nextInt();
		System.out.println("Enter an array of numbers:");
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		
		for(int i=1; i<n; i++) {
			temp = a[i];
			j = i;
			while(j>0 && a[j-1] > temp) {
				a[j] = a[j-1];
				j = j-1;
			}
			a[j] = temp;
		}
		
		System.out.println("Sorted array:");
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
		
	}
}
