package com.kodnest.PrintEvenNumbers;
import java.util.Scanner;

public class Even {
	public static void printEvenNumbers(int n)
	{
		System.out.println("Even numbers between 1 to n are:");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n=scan.nextInt();
		printEvenNumbers(n);
		
		

	}

}
