package lec5_string_2Darray;

import java.util.Scanner;

public class WavePrint_of2Darray {
	
	public static void wavePrint2Darray(int a[][])
	{
		int j=0,i;
		for(;j<a[0].length;j++)
		{
			for(i=0;i<a.length;i++)
				System.out.print(a[i][j]+" ");
			
			j=j+1;
			i=i-1;
			
			for(;i>=0&&j<a[0].length;i--)
				System.out.print(a[i][j]+" ");
		}
	}
	public static int[][] input2Darray()
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int[][] arr2D=new int [row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("enter "+i+" "+j+" element:");
				arr2D[i][j]=s.nextInt();
			}
		}
		return arr2D;
		
	}
	
	public static void print2Darray(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.print("input rows and colums: ");
		Scanner s=new Scanner(System.in);
		int[][] arr2D=input2Darray();
		print2Darray(arr2D);
		wavePrint2Darray(arr2D);
		
		
	}

	
	
}
