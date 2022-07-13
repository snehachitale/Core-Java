package com.java;

@FunctionalInterface
interface Domain {
	Appl getApp(String aName);
}
class Appl {
	Appl(String aName){
		System.out.println(aName);
	}
}
public class Application {

	public static void main(String[] args) {
		Domain d = Appl::new;
		d.getApp("Ericcson");
	}
}
