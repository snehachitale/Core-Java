package com.collection;


import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("Sean");
		list.add("John");
		list.add("Milli");
		
		System.out.println(list);
		
		list.add(2, "Tia");
		System.out.println(list);
		
		list.remove("Tia");
		System.out.println(list);
	}
}
