package com.kodnest.NaturalNumber;
import java.util.Scanner;

public class NaturalNumber {
	public static void sumOfNatural(int n)
	{
		int sum=0;
		System.out.println("sum of first n natural numbers are: ");
	for(int i=1;i<=n;i++)
	{
		
		sum=sum+i;
	}
	     System.out.println(sum);
	
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scan.nextInt();
		sumOfNatural(n);
		scan.close();
	}

}
