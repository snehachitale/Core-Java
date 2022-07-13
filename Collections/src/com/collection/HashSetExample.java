package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Product> products = new HashSet<Product>();
		
		products.add(new Product(1, "Bag", 900));
		products.add(new Product(2, "Cap", 100));
		products.add(new Product(3, "Chair", 400));
		products.add(new Product(4, "Bag", 900));
		products.add(new Product(1, "Bottle", 200));
		products.add(new Product(1, "Bag", 200));
		products.add(new Product(3, "Chair", 400));
		products.add(new Product(3, "Chair", 400));
		
		System.out.println("Size = " + products.size());
		for(Product p: products) {
			System.out.println(p);
		}	
		
	}
}

