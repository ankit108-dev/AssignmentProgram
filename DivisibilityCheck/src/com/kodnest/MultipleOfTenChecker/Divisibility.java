package com.kodnest.MultipleOfTenChecker;
import java.util.Scanner;

public class Divisibility {
	static void checkMultipleOfTen(int num)
	{
		if(num%10==0)
		{
			System.out.println("The number "+num+ " is multiple of 10");
		}
		else
		{
			System.out.println("The number "+num+ " is not multiple of 10");
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		checkMultipleOfTen(num);
		scan.close();
		

	}

}
