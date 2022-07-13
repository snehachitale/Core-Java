package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Product> products = new TreeSet<Product>();
		
		products.add(new Product(1, "Bag", 900));
		products.add(new Product(1, "Bag", 900));
		products.add(new Product(2, "Cap", 100));
		products.add(new Product(1, "Bag", 900));
		products.add(new Product(3, "Bottle", 200));
		
		System.out.println("Size = " + products.size());
		for(Product p: products) {
			System.out.println(p);
		}
	}
}
