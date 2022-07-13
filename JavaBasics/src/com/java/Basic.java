package com.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Basic {

	int a = 2;
	int b = 2;

	static {
		System.out.println("This is static block");
	}

	public void function() {
		int r = a + b;
		System.out.println(r);
	}

	public static void main(String[] args) {

		System.out.println("This is main method");
		Basic b = new Basic();
		b.function();

	}

}
