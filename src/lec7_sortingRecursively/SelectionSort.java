package lec7_sortingRecursively;

import java.util.Scanner;

public class SelectionSort {
	public static void SelectionSort(int []a,int beg)
	{
	  	if(beg>=a.length)
	  		return;
	  	for(int i=beg+1;i<a.length;i++)
	  	{
		  	if(a[beg]>a[i])
		  	{
		  		int temp=a[beg];
		  		a[beg]=a[i];
		  		a[i]=temp;	
		  	}
	  	}
	  	SelectionSort(a,beg+1);
	}
	
	public static  int[]  takeInput()
	{
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
		
		  int arr[]=takeInput(); 
		  SelectionSort(arr,0);
		  printArray(arr);
  }

}
