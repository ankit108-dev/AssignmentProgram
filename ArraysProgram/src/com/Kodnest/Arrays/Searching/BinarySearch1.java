package com.Kodnest.Arrays.Searching;
import java.util.Scanner;

import com.Kodnest.Arrays.Sorting.BubbleSort;

public class BinarySearch1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of Array:");
		//Crating Array
		int []array=new int[scan.nextInt()];
		System.out.println("enter "+array.length+ " elements: ");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		//calling bubble sort to sort the array
		BubbleSort sort=new BubbleSort();
				sort.doBubbleSort(array);
				//print Array after sorting
				System.out.println("Array elements After sorting:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("enter key to search:");
		int key=scan.nextInt();
		
		
		//by creating object we are accessing method of binary search class
		BinarySearchApp search=new BinarySearchApp();
		int foundIndex=search.doBinarySearch(array, key);
		
		if(foundIndex!=-1)
		{
			System.out.println("Elements "+key+ "found at index "+foundIndex);
		}
		else
		{
			System.out.println("Elements "+key+ " not found in the array");
		}
		scan.close();
	}

}
