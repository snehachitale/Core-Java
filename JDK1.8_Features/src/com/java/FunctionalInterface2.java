package com.java;

@FunctionalInterface
interface In1{
	int calc(int p, int h);
}

public class FunctionalInterface2 {

	public static void main(String[] args) {
		In1 i1 = (p,h)->(p*h);
		System.out.println(i1.calc(3, 4));
		In1 i2 = (int k, int m)->(k+m);
		System.out.println(i2.calc(12, 6));
	}
}
