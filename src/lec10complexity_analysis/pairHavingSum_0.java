package lec10complexity_analysis;

import java.util.Scanner;

public class pairHavingSum_0 {

public static void findSum(int[]a)
{
	int i=0,j=a.length-1;
	
	while(i!=j)
	{
		if(a[i]+a[j]>0)
		{
			j--;
			continue;
		}
		if(a[i]+a[j]<0)
		{
			i++;
			continue;
		}
		else
		{
			System.out.println(a[i]+" "+a[j]);
			i++;
			j--;
		}
	}
}
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
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else if(a[i]==b[j])
			{
				c[k]=a[i];
				k++;
				c[k]=a[i];
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
	
	public static  int[]  takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter size ");
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter "+i+" element");
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
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[]=takeInput();
		System.out.print("\nLIST->");
		printArray(arr);
		MergeSort(arr);
		findSum(arr);
	}
	
}
