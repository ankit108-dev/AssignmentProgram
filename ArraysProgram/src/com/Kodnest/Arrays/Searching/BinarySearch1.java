package com.Kodnest.Arrays.Searching;

public class BinarySearch1 {
	public static void main(String[] args) {
		int []array= {10,20,30,89,97,100};
		
		int key=101;
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
	}

}
