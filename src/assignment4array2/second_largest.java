package assignment4array2;

import java.util.Scanner;

public class second_largest {

	
	public static int second_largest(int input[])
	{
		for(int i=0;i<2;i++)//similar to bubble sort but only works to time insted of n-1
		{
			for(int j=0;j<input.length-i-1;j++)
				if(input[j+1]<input[j]) /* for making decending use a[i]< a[j]  */
	            {
	                int k=input[j+1];
	                input[j+1]=input[j];
	                input[j]=k;
	            }
		}
		
	return input[input.length-2];
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
	public static void main(String[] args) {
		
  int arr[]= new int [10];
  arr=takeInput();
  int second_largest=second_largest(arr);
  System.out.println("2nd largest is "+second_largest);
  
	}

}
