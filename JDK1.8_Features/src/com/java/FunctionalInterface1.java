package com.java;

@FunctionalInterface
interface Greet {
	String wish(String s);
}

public class FunctionalInterface1 {

	public static void main(String[] args) {
		Greet g = (s) -> {
			String s1 = "Hello Team";
			String s2 = s1 + " How's the session?";
			return s + s2;
		};
		System.out.println(g.wish("I am asking..."));
	}
}
