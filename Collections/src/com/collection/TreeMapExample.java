package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "Sean");
		map.put(99, "Scott");
		map.put(1793, "Miller");
		map.put(2, "Jenny");
		map.put(5, "John");
		map.put(99, "Tom");
		
		System.out.println(map);
	}
}
