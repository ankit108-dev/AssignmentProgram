package com.Kodnest.AssignmentProblem;
import java.util.Scanner;
public class Calulator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first digit");
		int num1=scan.nextInt();
		System.out.println("Enter second digit");
		int num2=scan.nextInt();
		System.out.println("Enter a character");
		char character=scan.next().charAt(0);
		
		CalculatorApp c1=new CalculatorApp();
		
		c1.calc(character,num1,num2);
		scan.close();
		
		

	}

}
