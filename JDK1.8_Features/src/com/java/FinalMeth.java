package com.java;

class App {
	final void run() {
		System.out.println("This app is running...");
	}
}
public class FinalMeth extends App{

	public static void main(String[] args) {
		FinalMeth m = new FinalMeth();
		m.run();
	}
}
