package lec10complexity_analysis;

import java.util.Scanner;

public class quickSort {
	
	public static int partition(int[]input,int beg,int end)
	{
		int pivotpos=beg;
		for(int i=beg+1;i<=end;i++)
		{
			if(input[i]<=input[beg])
			{
				pivotpos++;
				continue;
			}
		}
		
		int temp=input[pivotpos];
			input[pivotpos]=input[beg];
			input[beg]=temp;
		
		for(int i=beg,j=end;i<pivotpos&&j>pivotpos;)
		{
			if(input[i]<=input[pivotpos])
			{
				i++;
				continue;
			}
			if(input[j]>input[pivotpos])
			{
				j--;
				continue;
			}
			else
			{
			temp=input[i];
			input[i]=input[j];
			input[j]=temp;
			}
		}		

		return pivotpos;
	}

	public static void quick_sort(int[]input,int beg,int end)
	{
		if(beg>=end)
			return;
		int pivotpos=partition(input,beg,end);
		quick_sort(input, beg, pivotpos-1);
		quick_sort(input, pivotpos+1, end);
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
		quick_sort(arr,0,arr.length-1);
		printArray(arr);
		
	}

}
