package com.java;

import java.util.Scanner;

class NotEligibleForLoanException extends Exception{

	NotEligibleForLoanException(String s){
		super(s);
	}
}

class PayTheTaxPromptlyException extends Exception{

	PayTheTaxPromptlyException(String s){
		super(s);
	}
}

public class EmployeeSalary {

	public static void checkGross(double gross) throws NotEligibleForLoanException, PayTheTaxPromptlyException {
		if(gross <= 15000) {
			throw new NotEligibleForLoanException("Sorry, you are not eligible for the loan!");
		}else if(gross >= 50000){
			throw new PayTheTaxPromptlyException("Please, pay the tax promptly!");
		}
		else {
			System.out.println("You are eligible for the loan!");
		}
	}
	
	public static void main(String[] args) {
		
		int eId;
		String eName;
		double basic;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee Id:");
		eId = s.nextInt();
		
		System.out.println("Enter Employee Name:");
		eName = s.next();
		
		System.out.println("Enter Basic Salary Of Employee: ");
		basic = s.nextDouble();
		
		double hra = (basic*6)/100;
		double ta = (basic*4)/100;
		double da = (basic*9)/100;
		
		double gross = basic + hra + ta + da ;
		System.out.println("--------------------------------");
		System.out.println("Employee Id:      " +eId);
		System.out.println("Employee Name:    " +eName);
		System.out.println("Gross Salary:     " +gross);
		System.out.println("--------------------------------");
		
		try {
			checkGross(gross);
		}
		catch(NotEligibleForLoanException n) {
			System.out.println(n);
		}
		catch(PayTheTaxPromptlyException p) {
			System.out.println(p);
		}
		
	}
	
	
}
