package com.kodnest.BitwiseCounter;
import java.util.Scanner;

public class BitwiseCount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		BitwiseCountApp.countSetBits(num);
		

	}

}
