package lec3;

import java.util.Scanner;

public class array_use {
	
	public static int[]input_array()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter size:");
		int size= s.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("enter"+i+"element: ");
			input[i]=s.nextInt();
			
		}
		return input;
	}	
		public static void print_array(int []input)
		{
			System.out.println();
			for(int i=0;i< input.length ;i++)
			{
				System.out.print(input[i]+" ");
			}
				
		}
		
		public static int sum_array(int []input)
		{
			int sum=0;
			for(int i=0;i< input.length ;i++)
			{
				sum=sum+input[i];
			}
			return sum;	
		}
		
		public static int largest_array(int input[])
		{
			for( int j=1; j< input.length;j++)
			{
				if(input[j]>input[0])
				{
					int k=input[j];
						input[j]=input[0];
						input[0]=k;
				}
			}
			return input[0];
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[100];
		arr=input_array();
		System.out.print("\narray is ");
		print_array(arr);
		int sum=sum_array(arr);
		System.out.println("\nsum="+sum);
		int largest=largest_array(arr);
		System.out.println("\nlargest="+largest);

	}

}
