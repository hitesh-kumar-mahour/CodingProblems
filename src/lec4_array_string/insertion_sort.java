package lec4_array_string;

import java.util.Scanner;

public class insertion_sort {
	
	public static void insertion_sort(int []input)
	{
		for(int i=1;i<input.length;i++)
	    {
	    int temp=input[i];
	    int j=i-1;
	        while(j>=0 && temp<input[j]) 
	       {
	        input[j+1]=input[j];
	        j--;
	        }
	    input[j+1]=temp;
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
		insertion_sort(arr);
		System.out.println("increasing order");
		printArray(arr);
		

	}



}
