package lec4_array_string;

import java.util.Scanner;

public class selection_sort {
	
	public static void selection_sort(int input[])
	{
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]>input[j]) /* for making decending use input[i]< input[j]  */
	            {
	               int k=input[i];
	                input[i]=input[j];
	                input[j]=k;
	            }
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
		selection_sort(arr);
		printArray(arr);
		

	}

}
