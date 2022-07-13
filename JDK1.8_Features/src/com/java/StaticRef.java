package com.java;

@FunctionalInterface
interface Read {
	
	void read();
}
class Book {
	final static String name = "Java";
	public static void readBook() {
		System.out.println("This is static method");
		System.out.println(name);
	}
}
public class StaticRef {

	public static void main(String[] args) {
		Read r = Book::readBook;
		r.read();
	}
}
