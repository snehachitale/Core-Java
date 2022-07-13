package com.java;

import java.util.Scanner;

class OutOfStockException extends Exception{

	OutOfStockException(String s){
		super(s);
	}
}

public class CustomException {
	
	static int pId = 123;
	static String pName = "pen";
	static double uPrice = 20;
	static int stock = 7;
	static int totalCount;
	
	static void totalCount(int quantity) throws OutOfStockException{
		if(stock < quantity) {
			throw new OutOfStockException("Sorry, Product is out of stock!");
		}
		else {
			totalCount = stock - quantity;
			System.out.println("Total Cost:" + quantity * uPrice);
			System.out.println("Remaining Stock:" + totalCount);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("*****Product Details*****");
		System.out.println("-------------------------");
		System.out.println("Product Id:" + pId);
		System.out.println("Product Name:" + pName);
		System.out.println("Product Price:" + uPrice);
		System.out.println("-------------------------");
		System.out.println("Enter quantity:");
		int quantity = s.nextInt();
		
		try {
			totalCount(quantity);
		}
		catch(OutOfStockException e) {
			System.out.println("Exception:" +e);
		}
		
	}
	
}
