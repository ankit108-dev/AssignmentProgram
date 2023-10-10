package com.Kodnest.Arrays;
import java.util.Scanner;

public class ReturnArray {
	public static int[] printArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array length:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" Array Elements:");
		
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int []print=printArray(arr);
		//print Array elements
		for(int var:print)
		{
			System.out.println(var+" ");
		}
		scan.close();
	}

}
