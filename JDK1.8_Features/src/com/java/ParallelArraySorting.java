package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParallelArraySorting {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Green");
		set.add("Red");
		set.add("Blue");
		set.add("Yellow");
		set.add("Orange");
		
		System.out.println("HashSet:");
		set.forEach(s -> System.out.print(s+" "));
		System.out.println("\n");
		
		String arr[] = new String[set.size()];
		
		set.toArray(arr);
		
		System.out.println("Array elements:");
		for(String a: arr) {
			System.out.print(a+" ");
		}
		System.out.println("\n");
		
		Arrays.parallelSort(arr);
		
		System.out.println("Array after sorting:");
		for(String i: arr) {
			System.out.print(i+" ");
		}
	}
}
