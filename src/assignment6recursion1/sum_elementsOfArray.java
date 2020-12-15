package assignment6recursion1;

import java.util.Scanner;


public class sum_elementsOfArray {

	public static int arraySum(int []a,int beg)
	{
	 if(beg==a.length)
	    return 0;
	 
	 return a[beg]+arraySum(a, beg+1);
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
		System.out.println("sum="+arraySum(arr, 0));
	}

}
