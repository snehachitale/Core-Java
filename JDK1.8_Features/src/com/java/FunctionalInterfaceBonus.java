package com.java;

@FunctionalInterface
interface CalculateBonus {
	void calc(int bonus);
}

public class FunctionalInterfaceBonus {

	public static void main(String[] args) {
		CalculateBonus c = (bonus) -> {
			System.out.println("Bonus is:" +bonus);
		};
		
		c.calc(10000);
	}
}
