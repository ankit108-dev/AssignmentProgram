package com.kodnest.DiscountAplicable;
import java.util.Scanner;

public class DiscountAplicable {
	public static void checkDiscount(double pamount)
	{
	
		if(pamount>100)
		{
			System.out.println("Discount Aplicable");
		}
		else
		{
			System.out.println("Discount not aplicable");
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter purchase Amount(in $): ");
		double pamount=scan.nextDouble();
		checkDiscount(pamount);
		scan.close();
		

	}

}
