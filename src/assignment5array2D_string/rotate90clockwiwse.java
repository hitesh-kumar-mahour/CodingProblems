package assignment5array2D_string;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class rotate90clockwiwse {
	
	public static int[][] rotate(int a[][])
	{
		int b[][]=new int[a[0].length][a.length];
		for(int i=0,q=b[0].length-1;i<a.length;i++,q--)
		{
			for(int j=0,p=0;j<a[0].length;j++,p++)
				b[p][q]=a[i][j];
		}
		return b;
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
		System.out.println();
		print2Darray(rotate(arr2D));	
	}

}
