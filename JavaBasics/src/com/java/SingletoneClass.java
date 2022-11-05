package com.java;

public class SingletoneClass {

	private static SingletoneClass ref = null;
	private SingletoneClass() {
		
	}
	
	public static SingletoneClass getInstance() {
		if(ref == null) {
			ref = new SingletoneClass();
		}
		
		return ref;
	}
}
