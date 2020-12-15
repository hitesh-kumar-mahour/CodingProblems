package lec4_array_string;

import java.util.Scanner;

public class equilibrium_index {
	public static int find_equi(int[]input)
	{
		
		
		for(int i=1;i<input.length-1;i++)
		{
			int sum_left=0,sum_right=0;
			for(int left=0;left<i;left++)
			{
				sum_left+=input[left];
			}
			for(int right=i+1;right<input.length;right++)
			{
				sum_right+=input[right];
			}
			System.out.println("\tleftsum rightsum");
			System.out.println("pos:"+i+"\t"+sum_left+"\t"+sum_right);
			if(sum_left==sum_right)
				return i;	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[20];
		arr=takeInput();
		int equi_index=find_equi(arr);
		if(equi_index!=-1)
			System.out.println("equilibrium present at position "+equi_index);
			else
				System.out.println("equilibrium not present");
		
		

	}

}
