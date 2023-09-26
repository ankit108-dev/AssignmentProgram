package com.Kodnest.Arrays;
import java.util.Scanner;

public class TwoDimensionArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Total number of class:");
		System.out.println("Enter total number of Students:");
		
		//Creation of an array
		int [][]arr=new int[scan.nextInt()][scan.nextInt()];
		//Input elements
		System.out.println("Input Elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		//Printing Elements
		System.out.println("Array contents:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
