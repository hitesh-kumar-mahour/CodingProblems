package lec6_recursion;

import java.util.Scanner;

public class index_of_7 {
	
	public static int[] all_indicesOf7(int[]a,int beg)
	{
		if(beg>=a.length)
		{
			int []output={};
			return output;
		}

		int []smalloutput=all_indicesOf7(a, beg+1);
		
		if(a[beg]==7)
		{
			int [] output= new int[smalloutput.length+1];
			output[0]=beg;
			for(int i=0;i<smalloutput.length;i++)
				output[i+1]=smalloutput[i];
			
			return output; 
		}
		
		return smalloutput;
	}

		public static int ifPresent(int[]a,int beg)
		{
			if(beg==a.length-1)
				return -1;
			if(a[beg]==7)
				return beg;
			
			return ifPresent(a,beg+1);

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
	int arr[]=takeInput();
	System.out.print("\narray->");
	printArray(arr);
	//System.out.println(ifPresent(arr,0));
	printArray(all_indicesOf7(arr,0));

		}

	}


