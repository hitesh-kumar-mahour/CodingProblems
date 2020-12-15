package lec5_string_2Darray;

import java.util.Scanner;

public class LargestSumOfRowOrColumnIn2dArray {
	
	public static int largest_sum(int a[][])
	{
		int sumr1=0,sumr2;
		int sumc1=0,sumc2;
		for(int i=0;i<a.length;i++)
		{
			 sumr2=0;
			for(int j=0;j<a[0].length;j++)
			{
				
				if(i==0)
				{
					sumr1+=a[i][j];
				}
				else
				{
					sumr2+=a[i][j];
				}
				if(sumr1<sumr2)
					sumr1=sumr2;
			}
		}
		for(int j=0;j<a[0].length;j++)
		{
			 sumc2=0;
			for(int i=0;i<a.length;i++)
			{
				
				if(j==0)
				{
					sumc1+=a[i][j];
				}
				else
				{
					sumc2+=a[i][j];
				}
				if(sumc1<sumc2)
					sumc1=sumc2;
			}
		}
		
		if(sumr1>sumc1)
		{
		System.out.print("row sum ");
	      return sumr1;
		}
		else
		{	
		System.out.print("col sum ");
			return sumc1;
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
		System.out.println(largest_sum(arr2D));
		
		
	}

}
