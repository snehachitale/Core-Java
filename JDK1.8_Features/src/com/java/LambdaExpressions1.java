package com.java;

@FunctionalInterface
interface Pay{
	public String calc(int sal);
}

public class LambdaExpressions1 {

	public static void main(String[] args) {
		Pay p = (sal) -> {
			return "Salary credited..." + sal;
		};
		System.out.println(p.calc(198456));
	}
}
