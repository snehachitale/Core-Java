package com.java;

import java.util.HashMap;
import java.util.Scanner;

public class OccurencesOfCharactersInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			String s = sc.next();
			
			HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
			for(int i = 0; i<s.length(); i++) {
				if(hMap.containsKey(s.charAt(i))) {
					hMap.put(s.charAt(i), hMap.get(s.charAt(i))+1);
				}else {
					hMap.put(s.charAt(i), 1);
				}
			}
			System.out.println(hMap);
	}
}
