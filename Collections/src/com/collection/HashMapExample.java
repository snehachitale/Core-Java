package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Person, Address> map = new HashMap<Person, Address>();
		
		map.put(new Person("John", "Dey"), new Address("HM Park", "Bangalore", "Karnataka"));
		map.put(new Person("Shyam", "Sundar"), new Address("Bank Colony", "Bangalore", "Karnataka"));
		map.put(new Person("John", "Dey"), new Address("HM Park", "Bangalore", "Karnataka"));
		map.put(new Person("Shyam", "Sundar"), new Address("KS Layout", "Mysor", "Karnataka"));
		
		System.out.println("No. of elements in the map:" + map.size());
		for(Person p: map.keySet()) {
			System.out.println(p);
		}
	}
}
