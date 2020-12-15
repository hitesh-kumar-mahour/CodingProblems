package assignment5array2D_string;

import java.util.Scanner;

public class multiply2Darray {
	
	public static int[][] multiply_array(int[][]a,int[][]b)
	{
		int c[][]= new int[a.length][b[0].length];
		if(a[0].length!=b.length)
		{
			System.out.println("multiple not possible");	 
			return c ;
		}
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[0].length;j++)
		{
			int x=i,q=j;
			for(int y=0,p=0;y<a[0].length;y++,p++)
			{
				c[i][j]+=a[x][y]*b[p][q];
			}
		}
	}
		return c;
		  
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

	public static int[][] input2Darray()
	{
		System.out.print("input rows and colums: ");
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
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[][] arr1=input2Darray();
		int[][] arr2=input2Darray();
		
		int arr_product[][]=multiply_array(arr1,arr2);
		print2Darray(arr1);
		System.out.println();
		print2Darray(arr2);
		System.out.println();
		print2Darray(arr_product);	
	
	}
		
		
}

