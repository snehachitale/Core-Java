package com.java;

class DayException extends Exception{
	private String message;
	
	public DayException() {
		this.message = "";
	}
	
	public DayException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "Day should be in between 1 to 31." +this.message;
	}
}

class Date {
	private int day;

	public void setDay(int day) throws DayException {
		if(day > 31 || day < 1)
			throw new DayException("Invalid day: " +day);
		this.day = day;
	}
}
public class CustomExceptionDay {

	public static void main(String args[]) {
		Date date = new Date();
		try {
			date.setDay(35);
		}
		catch(DayException e) {
			e.printStackTrace();
		}
	}
}
