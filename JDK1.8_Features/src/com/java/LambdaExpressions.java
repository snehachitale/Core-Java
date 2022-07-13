package com.java;

interface Payroll{
	public void calc();
}

public class LambdaExpressions {

	public static void main(String[] args) {
		int basic = 10000;
		/*
		Payroll p = new Payroll() {

			@Override
			public void calc() {
				System.out.println("Basic Pay : " + basic);
			}
		};
		p.calc();*/
		
		Payroll p = () -> {
			System.out.println("Basic Pay : " + basic);
		};
		p.calc();
	}
}
