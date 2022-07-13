package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list;
		
		list = new ArrayList<String>();
		list.add("Sean");
		list.add("John");
		list.add("Milli");
		
		list.add(1, "Jenny");
		list.remove(2);
		list.set(2, "Tia");
		
		System.out.println(list);
	}
}
