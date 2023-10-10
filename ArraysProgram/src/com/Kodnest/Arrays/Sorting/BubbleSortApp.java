package com.Kodnest.Arrays.Sorting;
import java.util.Scanner;

public class BubbleSortApp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		//creation of Array
		System.out.println("Enter Array elements:");
		int []arr=new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements before Sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//creating object of BubbleSort class to access methods
		BubbleSort sort=new BubbleSort();
		sort.doBubbleSort(arr);
		System.out.println(); 
		System.out.println("array elements after sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
