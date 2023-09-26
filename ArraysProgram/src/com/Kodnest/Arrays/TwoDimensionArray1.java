package com.Kodnest.Arrays;
import java.util.Scanner;


public class TwoDimensionArray1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Total number of Banks:");
		int numRow=scan.nextInt();
		System.out.println("Enter total number of Customer in each bank:");
		int numColumn=scan.nextInt();
		//Creation of 2D array
		String [][]bank_Customer=new String[numRow][numColumn];
		//Input Customer name
		System.out.println("Enter Customer name: ");
		for(int i=0;i<bank_Customer.length;i++)
		{
			for(int j=0;j<bank_Customer[i].length;j++)
			{
				bank_Customer[i][j]=scan.next();
			}
		}
		//Printing Customer name
		System.out.println("Customers name are: ");
		for(int i=0;i<bank_Customer.length;i++)
		{
			for(int j=0;j<bank_Customer[i].length;j++)
			{
				System.out.print(bank_Customer[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
		

	}

}
