package com.Kodnest.Arrays;

public class Print2DArray {
	public static void main(String[] args) {
		//Array creation and initialization
		int [][]arr= {{10,20,30},{40,50,60}};
		//printing 2 D array
		System.out.println("2d array contents: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
