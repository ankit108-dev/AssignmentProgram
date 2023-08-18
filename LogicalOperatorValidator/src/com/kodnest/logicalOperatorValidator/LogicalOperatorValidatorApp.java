package com.kodnest.logicalOperatorValidator;
import java.util.Scanner;

public class LogicalOperatorValidatorApp {

	public static void main(String[] args) {
		System.out.println("Enter two boolean Value: ");
		Scanner scan=new Scanner(System.in);
		boolean a=scan.nextBoolean();
		boolean b=scan.nextBoolean();
		
		LogicalOperator l1=new LogicalOperator();
		boolean result=l1.isValidInput(a,b);
		scan.close();
		
		if(true==result)
		{
			System.out.println("input is valid");
		}
		else
		{
			System.out.println("input is invalid");
		}

	}

}
