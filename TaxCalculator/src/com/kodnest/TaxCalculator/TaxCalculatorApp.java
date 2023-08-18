package com.kodnest.TaxCalculator;
import java.util.Scanner;

public class TaxCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Enter Purchase amount:");
		Scanner scan=new Scanner(System.in);
		double pamount=scan.nextDouble();
		System.out.println("Enter Tax rates(in decimal): ");
		double taxrate=scan.nextDouble();
		double result=Taxcalculator.calculateTotalWithTax(pamount,taxrate);
		System.out.println("Total cost including tax: "+result);
		scan.close();
		
		

	}
}



