package com.java;

abstract class Shape {  
	abstract void draw();  
} 

class Rectangle extends Shape {
	void draw() {
		System.out.println("This is Rectangle shape");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("This is Circle shape");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		s1.draw();
		
		Shape s2 = new Circle();
		s2.draw();
	}
}
