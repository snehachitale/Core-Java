package com.java;

import java.lang.reflect.*;

public class Reflection {

	public static void main(String[] args) {
		Class c;
		try {
			c = Class.forName("java.lang.String");
			Constructor con[] = c.getDeclaredConstructors();
			System.out.println(con);
			Method m[] = c.getDeclaredMethods();
			System.out.println(m);
			Field f[] = c.getDeclaredFields();
			System.out.println(f);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
