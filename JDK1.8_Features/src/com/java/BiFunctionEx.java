package com.java;

import java.util.function.BiFunction;

class Calc
{
	public static int compute(int a,int b)
	{
		return a*b+5;
	}
	public static float compute(float a,int b)
	{
		return a*b+5;
	}
	public static float compute(int a,float b)
	{
		return a*b+5;
	}
}
public class BiFunctionEx
{
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> a1 = Calc::compute;
		BiFunction<Float,Integer,Float> a2 = Calc::compute;
		BiFunction<Integer,Float,Float> a3 = Calc::compute;
		int p= a1.apply(4, 5);
		float q = a2.apply(34.5f,9);
		float r = a3.apply(4,5.2f);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
}