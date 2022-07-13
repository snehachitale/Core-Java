package com.java;

@FunctionalInterface
interface ArithmeticOp{
	int operation(int n1, int n2);
}

public class LambdaEx {

	public static void main(String[] args) {
		ArithmeticOp addition = (int n1, int n2) -> n1 + n2;
		ArithmeticOp subtraction = (n1, n2) -> n1 - n2;
		ArithmeticOp multiplication = (int n1, int n2) -> { return n1 * n2; };
		ArithmeticOp division = (n1, n2) -> { return n1 / n2; };
		
		System.out.println("Addition:" + addition.operation(10,10));
		System.out.println("Subtraction:" + subtraction.operation(10,5));
		System.out.println("Multiplication:" + multiplication.operation(5,5));
		System.out.println("Division:" + division.operation(10,2));
	}
}
