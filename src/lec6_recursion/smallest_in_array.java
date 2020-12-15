package lec6_recursion;

import java.util.Scanner;

public class smallest_in_array {

	public static int smallest(int[]a,int beg)
	{
		if(beg==a.length-1)
			return a[beg];
		if(a[beg]<a[beg+1])
		{
			int temp=a[beg];
			a[beg]=a[beg+1];
			a[beg+1]=temp;		
		}
	
		return smallest(a,beg+1);
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
System.out.print("\narray->");
printArray(arr);
System.out.println(smallest(arr,0));

	}

}
