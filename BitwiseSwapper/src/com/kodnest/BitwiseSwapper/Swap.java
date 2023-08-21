package com.kodnest.BitwiseSwapper;

public class Swap {
	public static void swapUsingBitwise(int num1,int num2)
	{

		num1=num1^num2;
		num2=num2^num1;
		num1=num1^num2;
		System.out.println("After Swapping: First= " +num1+" Second= " +num2);
	}

}
