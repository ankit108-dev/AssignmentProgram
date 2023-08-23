package com.kodnest.PrimeNumbers;
import java.util.Scanner;

public class PrimeNumber {
	public static void printPrimes(int num)
	{
		System.out.println("prime number between 1 to n: ");
	   int i,count;
	   for(i=2;i<=num;i++ )
	   {
		   count=0;
		   for(int j=2;j<i;j++)
		   {
			   if(i%j==0)
			   {
				   count++;
			   }
		   }
		   if(count==0)
		   {
			   System.out.print(i+" ");
		   }
	   }
			
			
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: "); 
		int num=scan.nextInt();
		
		printPrimes(num);
		scan.close();

	}

}
