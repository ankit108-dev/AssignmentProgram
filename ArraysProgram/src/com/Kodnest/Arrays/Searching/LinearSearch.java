package com.Kodnest.Arrays.Searching;
import java.util.Scanner;
public class LinearSearch {
public static int linearSearch(int[] arr,int key)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key)
		{
			return i;//element found at index and return
		}
	}
	return -1;//element not found
}

   public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Creation of Array
		System.out.println("Enter Array elements:");
		int []arr=new int[scan.nextInt()];
		//Input Array elements
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key to Search:");
		int key=scan.nextInt();
		
		int foundIndex=linearSearch(arr,key);
		{
			if(foundIndex!=-1)
			{
				System.out.println("Element "+key+" Found at "+foundIndex+" index");
			}
			else
			{
				System.out.println("Element "+key+" not Found");
			}
		}
		scan.close();
		
		
	}
}
	
	



