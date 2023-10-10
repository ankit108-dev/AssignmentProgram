//Addition Of two matrix 
package com.TwoDArrayProgram;
import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter row and column of matrix1:");
		int row1=scan.nextInt();//row number
		int col1=scan.nextInt();//column number
		//create Array
		int [][]a=new int[row1][col1];
		System.out.println("Enter Matrix1 elements:");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter row and column of matrix2:");
		int row2=scan.nextInt();
		int col2=scan.nextInt();
		//create Array
		int [][]b=new int[row1][col1];
		System.out.println("Enter Matrix2 elements:");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Matrix1 elements:");
		printMatrix(a);
		System.out.print("Matrix2 elements:");
		printMatrix(b);
		
		
		add(a,row1,col1,b,row2,col2);
		
	}

	 static void add(int[][] a, int row1, int col1, int[][] b, int row2, int col2) {
		
		if(row1!=row2||col1!=col2)
		{
			System.out.println("Wrong input ->Addition not possible");
			return;
		}
		//creating resultant Array
		int [][]sum=new int [row1][col1];//you can fill either row1&col1 or row2&col2
		  
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				sum[i][j]=a[i][j] + b[i][j];
			}
		}
		System.out.println("Sum of matrix1 and matrix2 is:");
		printMatrix(sum);
	}

	public static void printMatrix(int[][] matrix) {
		//printing matrix elements
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				 System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	

}
