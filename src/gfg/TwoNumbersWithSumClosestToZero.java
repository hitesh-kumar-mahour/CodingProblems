package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumbersWithSumClosestToZero {
//	http://www.geeksforgeeks.org/two-elements-whose-sum-is-closest-to-zero/
	
	public static void MergeSort(int []input)
	{
		if(input.length<=1)
			return;

		int a[]=new int[input.length/2];
		for(int i=0;i<a.length;i++)
		{
			a[i]=input[i];
		}
		
		int b[]=new int[input.length-a.length];
		for(int i=0,j=a.length;i<b.length;i++,j++)
		{
			b[i]=input[j];
		}
		//printArray(a);
		//printArray(b);
		MergeSort(a);
		MergeSort(b);
		merge(a,b,input);
	}
	
	public static void merge(int[]a,int[]b,int[]c) {
		int i=0,j=0,k=0;
		//int c[]=new int[a.length+b.length];
		for(;i<a.length&&j<b.length;k++)
		{
			if(Math.abs(a[i])<Math.abs(b[j]))
			{
				c[k]=a[i];
				i++;
			}
			else if(Math.abs(a[i])==Math.abs(b[j]))
			{
				c[k]=a[i];
				k++;
				c[k]=b[j];
				i++;
				j++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
		}
		
		for(;i<a.length;i++,k++)
		{
			c[k]=a[i];
		}
		for(;j<b.length;j++,k++)
			c[k]=b[j];
	}

	private static void fun(int[] a) {
		
		MergeSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int min=Integer.MAX_VALUE;
		int p=0;
		for (int i = 0; i < a.length-1; i++) 
		{
			
			if(Math.abs(a[i]+a[i+1])<min)
			{
				p=i;
				min=Math.abs(a[i]+a[i+1]);
			}
		}
		if(a[p]<a[p+1])
		System.out.println(a[p]+" "+a[p+1]);
		else 
			System.out.println(a[p+1]+" "+a[p]);
	}
	
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int size=s.nextInt();
			int [] a=new int[size];
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			fun(a);
			
		 t--;
		}
	}

}
