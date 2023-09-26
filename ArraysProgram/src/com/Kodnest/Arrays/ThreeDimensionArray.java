package com.Kodnest.Arrays;
import java.util.Scanner;

public class ThreeDimensionArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Creation of 3D Array
		int [][][]arr=new int[3][4][3];
		//Taking Input from User
		System.out.println("Enter Array elemets:");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		//printing 3D elements
		System.out.println("3D elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println(); 
			}
			System.out.println();
		}
		scan.close();
	} 

}
