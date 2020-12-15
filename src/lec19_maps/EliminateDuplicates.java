package lec19_maps;

import java.util.HashMap;
import java.util.Scanner;


public class EliminateDuplicates {

	public static void removeDupli(int[]input)
	{
		HashMap<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<input.length;i++)
		{
			if(!map.containsKey(input[i]))
				map.put(input[i], 1);
		}
		
		
		for(int x:map.keySet()){
		System.out.println(x);	
		}
		
		
		
	}
	public static int[]input_array()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter size:");
		int size= s.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("enter"+i+"element: ");
			input[i]=s.nextInt();	
		}
		System.out.println();
		return input;
	}	
	public static void main(String[] args) {
		int[]a=input_array();
		removeDupli(a);
		
	}
}
