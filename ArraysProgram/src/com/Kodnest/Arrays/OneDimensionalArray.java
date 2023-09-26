package com.Kodnest.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Elements:");

		//Creation of an Array
		int []arr=new int[scan.nextInt()];
		
		//Taking input elements
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Printing Arrays Elements
		System.out.println("Arrays elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
         scan.close();
	}

}
