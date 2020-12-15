package lec7_sortingRecursively;

import java.util.Scanner;

public class mergeSortedArrays {

	public static int[] merge(int[]a,int[]b,int[]c) {
		int i=0,j=0,k=0;
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
		
		return c;
	}

	public static  int[]  takeInput()
	{
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
		
  int arr1[]=takeInput();
  int arr2[]=takeInput();
  int output[]=new int[arr1.length+arr2.length];
  merge(arr1,arr2,output);  
	printArray(output);
	}


}
