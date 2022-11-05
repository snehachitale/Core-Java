package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("John");
		list.add("Julie");
		list.add("Sean");
		list.add("Tina");
		list.add("Bob");
		
		System.out.println("For Loop:");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterator:");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Advanced For Loop:");
		for(Object a: list) {
			System.out.println(a);
		}
	}
}
