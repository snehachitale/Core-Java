package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
		
		if(str1.length() == str2.length()) {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println(str1 + " and " + str2 + " are anagram!");
			}else {
				System.out.println(str1 + " and " + str2 + " are not anagram!");
			}
		}else {
			System.out.println(str1 + " and " + str2 + " are not anagram!");
		}
	}
}
