package lec4_array_string;

import java.util.Scanner;

public class bubble_sort {
	
	
	public static void bubble_sort(int input[])
	{
		for(int i=0;i< input.length-1;i++)
		{
			for(int j=0;j<input.length-i-1;j++)
				if(input[j+1]<input[j]) /* for making decending use a[i]< a[j]  */
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
//		int arr[]=new int[20];
//		arr=takeInput();
		 int arr[]=new int[100000];
		 for(int i=99999;i>=0;i--)
		 {
			 arr[99999-i]=i;
		 }
		bubble_sort(arr);
		printArray(arr);
		
	}

}
