package com.java;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Grape");
		l.add("Orange");
		l.add("Mango");
		l.add("Apple");
		
		l.forEach((i)->System.out.println(i));
	}
}
