package gfg;

import java.util.Scanner;

public class CountInversions {
//	http://www.geeksforgeeks.org/counting-inversions/
	public static int CountMergeSort(int []input)
	{
		if(input.length<=1)
			return 0;

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
		int left=CountMergeSort(a);
		int right=CountMergeSort(b);
		int curr=Countmerge(a,b,input);
		return left+right+curr;
	}
	
	public static int Countmerge(int[]a,int[]b,int[]c) {
		int count=0;
		int i=0,j=0,k=0;
		//int c[]=new int[a.length+b.length];
		for(;i<a.length&&j<b.length;k++)
		{
			if(a[i]<=b[j])
			{
				c[k]=a[i];
				i++;
			}
			
			else
			{
				count=count+a.length-i ;
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
		
		return count;
	}

	public static  int[]  takeInput()
	{
		Scanner s = new Scanner(System.in);
//		System.out.println("enter size ");
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
//			System.out.println("Enter "+i+" element");
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void  printArray(int[] input){
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		  int arr[]=takeInput();
		 
		  int count=CountMergeSort(arr);
//		  printArray(arr);
		  System.out.println(count);
    }
}
