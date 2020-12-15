package lec5_string_2Darray;

import java.util.Scanner;

public class SpiralPrint {

	public static void SpiralPrint2Darray(int a[][])
	{
		
		for(int p=0,q=a[0].length-1;p<=q;p++,q--)
		{
			int i=p,j=p;
			for(;j<=q;j++)
				System.out.print(a[i][j]+" ");
			
			i=i+1;
			j=j-1;
			for(;i<a.length-p;i++)
				System.out.print(a[i][j]+" ");
			
			i=i-1;
			j=j-1;
			for(;j>=p;j--)
				System.out.print(a[i][j]+" ");
			
			j=j+1;
			i=i-1;
			for(;i>=p+1;i--)
				System.out.print(a[i][j]+" ");
		}
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
//		System.out.print("input rows and colums: ");
		Scanner s=new Scanner(System.in);
//		int[][] arr2D=input2Darray();
		
		int t=s.nextInt();
		while(t>0)
		{
		int row=4;
		int col=4;
		int[][] arr2D=new int [row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
//				System.out.print("enter "+i+" "+j+" element:");
				arr2D[i][j]=0;
			}
		}
		print2Darray(arr2D);
//		System.out.println("p q i j val");
		SpiralPrint2Darray(arr2D);
		t--;
		}		
	}

}
