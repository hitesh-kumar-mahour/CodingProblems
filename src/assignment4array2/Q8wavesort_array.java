package assignment4array2;

import java.util.Scanner;

public class Q8wavesort_array {
	
	public static void wave_sort(int a[])
	{
		if(a.length%2==0)
		{
			for(int i=1,j=2;i<a.length-2;i+=2,j+=2)
			{
			int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		else
		{
			for(int i=1,j=2;i<a.length-1;i+=2,j+=2)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}

	public static void bubble_sort(int input[])
	{
		for(int i=0;i< input.length-1;i++)
		{
			for(int j=0;j<input.length-i-1;j++)
				if(input[j+1]>input[j])
	            {
	                int k=input[j+1];
	                input[j+1]=input[j];
	                input[j]=k;
	            }
		}
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
		int arr[]=new int[20];
		arr=takeInput();
		bubble_sort(arr);
		wave_sort(arr);
		printArray(arr);
		
	}
	
}
