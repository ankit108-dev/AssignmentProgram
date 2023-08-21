package com.kodnest.BitwiseSwapper;
import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int num1=scan.nextInt();
		System.out.println("Enter the second Integer:");
		int num2=scan.nextInt();
		Swap.swapUsingBitwise(num1,num2);
		scan.close();
		

	}

}
