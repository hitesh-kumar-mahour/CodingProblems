package lec4_array_string;

import java.util.Scanner;

public class binary_search {
	
	public static int binary_search(int []input,int start ,int end,int val)
	{
	
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(input[mid]==val)
				return(mid);
			else if(input[mid]>val)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
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
		int arr[]=new int[20]; 
		arr=takeInput();
		System.out.print("\nLIST->");
		printArray(arr);
		System.out.print("\nenter value to be searched: ");
		int val= s.nextInt();
		int pos=binary_search(arr,0,arr.length-1,val);
		if(pos!=-1)
		System.out.println(val+" present at position "+pos);
		else
			System.out.println(val+" not present");
	}

}
