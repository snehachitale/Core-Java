package com.java;

class MyException extends Exception {
	public MyException(int age) {
		System.err.println("Exceeded..."+age);
	}
}
public class CustomException {

	public void show(int i) throws MyException{
		if(i>60) throw new MyException(i);
		else
			System.out.println("Accepted..."+i);
	}
	
	public static void main(String[] args) {
		int a = 61;
		CustomException e = new CustomException();
		try {
			e.show(a);
		}
		catch(MyException m) {
			m.printStackTrace();
		}
		
	}
}
