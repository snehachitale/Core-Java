package com.java;

interface Drawable{
	void draw();
}

class Square implements Drawable{

	@Override
	public void draw() {
		System.out.println("Drawing Sqaure");
	}
	
}

class Triangle implements Drawable{

	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Drawable s1 = new Square();
		s1.draw();
		
		Drawable s2 = new Triangle();
		s2.draw();
	}
}
