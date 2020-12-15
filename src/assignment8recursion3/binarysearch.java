package assignment8recursion3;

import java.util.Scanner;

public class binarysearch {
	
	
	public static int binarysearch(int[]a,int val,int beg,int end)
	{
		if(beg>end)
		return -1;
		
		int mid=(beg+end)/2;
		
		 if(a[mid]==val)
			return mid;
		 if(val<a[mid])
			 return binarysearch(a, val, beg, mid-1);
		 else
			 return binarysearch(a, val, mid+1, end);
		
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
		System.out.print("\nenter value to be searched: ");
		int val= s.nextInt();
		int pos=binarysearch(arr,val,0,arr.length-1);
		if(pos!=-1)
		System.out.println(val+" present at position "+pos);
		else
			System.out.println(val+" not present");
	}

}
