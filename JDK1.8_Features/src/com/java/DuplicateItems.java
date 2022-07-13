package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateItems {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("java");
		l.add("angular");
		l.add("dotnet");
		l.add("react");
		l.add("node");
		l.add("bootstrap");
		l.add("java");
		l.add("react");
		l.add("angular");
		l.add("react");
		l.add("bootstrap");

		Set<String> s = new HashSet<String>();
		Set<String> s1 = new HashSet<String>();

		for(String list: l) {
			if(!s.add(list)) {
				s1.add(list);
			}
		}
		
		List<String> sorted = new ArrayList<String>(s1);
		Collections.sort(sorted);
		System.out.println(sorted);
		
		
	}
}
