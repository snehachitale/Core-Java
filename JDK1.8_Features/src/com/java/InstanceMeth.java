package com.java;

@FunctionalInterface
interface Domain1
{
	void tech();
}
public class InstanceMeth {

	public void deploy() {
		System.out.println("Application deployed successfully!");
	}
	public static void main(String[] args) {
		InstanceMeth a = new InstanceMeth();
		Domain1 d = a::deploy; //Instance method
		d.tech();
		Domain1 d1 = new InstanceMeth()::deploy; //Anonymous class
		d1.tech();
	}
}
