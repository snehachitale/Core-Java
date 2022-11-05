package com.java;

public class Singleton {

	public Singleton ref = null;
	private Singleton() {	
	}
	
	
	public Singleton getRef() {
		if(ref == null) {
			ref = new Singleton();
		}
		return ref;
	}
}
