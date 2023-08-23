package com.kodnest.FactorialNumber;
import java.util.Scanner;

public class FactorialPrint {
	public static void calculateFactorial(int num)
	{
		System.out.println("factorial of given number is: ");
		int prod=1;
		for(int i=num;i>=1;i--)
		{
			prod=prod*i;
		}
		System.out.println(prod);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		calculateFactorial(num);
		scan.close();
		 

	}

}
