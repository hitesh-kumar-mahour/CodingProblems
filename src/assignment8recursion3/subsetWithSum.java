package assignment8recursion3;

import java.util.Scanner;

public class subsetWithSum {

public static void printSubsets(int[]a,int beg,int[]decisionSoFar,int reqSum,int sumSoFar ){
		
		if(beg==a.length&&reqSum==sumSoFar)
		{
			printArray(decisionSoFar);
			return;
		}
		if(beg==a.length)
			return;
		
	
		printSubsets(a, beg+1, decisionSoFar,reqSum,sumSoFar);
		int addtoDecisionSoFar[]=new int[1+decisionSoFar.length];
		int i=0;
		for(;i<decisionSoFar.length;i++)
		{
			addtoDecisionSoFar[i]=decisionSoFar[i];
		}
		addtoDecisionSoFar[i]=a[beg];
		printSubsets(a, beg+1, addtoDecisionSoFar,reqSum,sumSoFar+a[beg]);
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
			for(int j=0;j<a[i].length;j++)
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
		System.out.print("enter sum: ");
		int sum =s.nextInt();
//		int sub[][]=subsets(arr,0);
//		print2Darray(sub);
		int[]empty={};
	  printSubsets(arr,0,empty,sum,0);
	}
}