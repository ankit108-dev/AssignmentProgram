package com.kodnest.BitwiseCounter;

public class BitwiseCountApp {
	public static void countSetBits(int num)
	{
		int count=0;
		while(num>0)
		{
		num=num&(num-1);
		count++;
		}
		System.out.println("Number of set bits: "+count);
	}

}
