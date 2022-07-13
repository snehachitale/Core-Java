package com.java;

public class ExceptionHandling extends Exception{

	public static void main(String[] args) throws Exception{
		try {
			/*
			String n = null;
			n.length();*/
			/*
			int a[] = {1, 2, 3, 4};
			a[5] = 5;*/
			/*
			String s = "Hi";
			int n = Integer.parseInt(s);*/
			int i=2, j=0;
			int d=i/j;
		}
		catch(ArrayIndexOutOfBoundsException a){
			a.printStackTrace();
			System.out.println("Catch 1");
		}
		catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println("Catch 2");
		}
		catch(ArithmeticException ar) {
			ar.printStackTrace();
			System.out.println("Catch 3");
		}
		catch(NumberFormatException nu) {
			nu.printStackTrace();
			System.out.println("Catch 4");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Catch 5");
		}
		finally {
			System.out.println("Finally executed...");
		}
	}
}
