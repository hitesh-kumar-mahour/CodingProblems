package assignment8recursion3;

import java.util.Scanner;

public class subsetofarray {
	
	public static int[][] subsets(int[]a,int beg)
	{
		if(beg>=a.length)
		{
			int[][]output={{}};
			return output;
		}
		int[][] smalloutput=subsets(a,beg+1);
		int[][]output=new int[2*smalloutput.length][];
		
		for(int i=0;i<smalloutput.length;i++)
		{
			output[i]=new int[smalloutput[i].length];
			output[i]=smalloutput[i];	
		}
		
		for(int i=0;i<smalloutput.length;i++)
		{
			output[i+smalloutput.length]=new int[smalloutput[i].length+1];
			output[i+smalloutput.length][0]=a[beg];
			for(int j=0;j<smalloutput[i].length;j++)
			{
				output[i+smalloutput.length][j+1]=smalloutput[i][j];
			}
		}
		
		return output;
	}
	
	public static void printSubsets(int[]a,int beg,int[]decisionSoFar ){
		
		if(beg==a.length)
		{
			printArray(decisionSoFar);
			return;
		}
		printSubsets(a, beg+1, decisionSoFar);
		int addtoDecisionSoFar[]=new int[1+decisionSoFar.length];
		int i=0;
		for(;i<decisionSoFar.length;i++)
		{
			addtoDecisionSoFar[i]=decisionSoFar[i];
		}
		addtoDecisionSoFar[i]=a[beg];
		printSubsets(a, beg+1, addtoDecisionSoFar);
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

	public static void print2Darray(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int j=0;
			for(;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[]=takeInput();
		System.out.print("\nLIST->");
		printArray(arr);
		int sub[][]=subsets(arr,0);
		
		//method1
		print2Darray(sub);
		
		//method2
//		int[]empty={};
//	  printSubsets(arr,0,empty);
	}
}
