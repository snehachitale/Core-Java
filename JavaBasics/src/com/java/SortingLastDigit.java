package com.java;

import java.util.Collections;

public class SortingLastDigit {

	public static void main(String[] args) {
		int a[] = {39, 27, 32, 24, 22, 70};
		int j = 0;
		
		for(int i=0; i<a.length; i++) {
			a[j] = a[i] % 10;
			
			System.out.println(a[j]);
		}
	}
}
