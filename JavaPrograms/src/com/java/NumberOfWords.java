package com.java;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		String[] strArr = str.split(" ");
		for(String s: strArr) {
			map.put(map.size()+1, s);
		}
		
		System.out.println("Number of words in a String: " +map.size());
		System.out.println(map);
	}
}
