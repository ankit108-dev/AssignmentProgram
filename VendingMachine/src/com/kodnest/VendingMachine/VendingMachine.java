package com.kodnest.VendingMachine;
import java.util.Scanner;

public class VendingMachine {
	public static void identifyProduct(String pcode)
	{
		switch(pcode)
		{
		case "P01":
		{
			System.out.println("coca-cola");
			break;
		}
		case "P02":
		{
			System.out.println("coca-cola");
			break;
		}
		case "P03":
		{
			System.out.println("Limica");
			break;
		}
		case "P04":
		{
			System.out.println("Thump up");
			break;
		}
		default:
		{
			System.out.println("Invalid product Code");
			break;
		}
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter product code: ");
		String pcode=scan.next();
		identifyProduct(pcode);
		scan.close();

	}

}
