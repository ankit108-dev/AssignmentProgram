package com.Kodnest.Arrays.Sorting;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array elements:");
		int n=scan.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		insertionSort(arr);
		
		System.out.println("Array elememts after sorting:");
		for(int var:arr)
		{
			System.out.print(var+" ");
		}
	}

	public static void insertionSort(int[] arr) {
		
		{
			for(int i=1;i<arr.length;i++)
			{
				int j=i;
				
				while(j>0&&arr[j]<arr[j-1])
				{
					//swap arr[j],arr[j-1]
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					j--;
				}
			}
		}
		
	}

}
