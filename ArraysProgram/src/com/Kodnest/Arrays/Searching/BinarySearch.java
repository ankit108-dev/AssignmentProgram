package com.Kodnest.Arrays.Searching;
import java.util.Scanner;


public class BinarySearch {
	public static int binarySearch(int []array,int key)
	{
		int low=0;
		int high=array.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==key)
			{
				return mid;//return mid index
			}else if(key>array[mid])
			{
				low=mid+1;//search right side
			}
			else
			{
				high=mid-1;//search left side
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array elements: ");
		int []array=new int[scan.nextInt()];
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		System.out.println("Enter key to search:");
		int key=scan.nextInt();
		int foundIndex=binarySearch(array,key);
		if(foundIndex!=-1)
		{
			System.out.println("Element "+key+ " found at "+foundIndex+ " index");
		}
		else
		{
			System.out.println("Element "+key+ " not found");
		}
		scan.close();
	}

}
