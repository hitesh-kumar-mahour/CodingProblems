package lec19_maps;

import java.util.HashMap;
import java.util.Scanner;

public class PairsSumTOZero {

	public static void zeroPair(int input[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<input.length;i++)
		{
			if(!map.containsKey(input[i]))
				map.put(input[i], 1);
			else
			{
				int freq=map.get(input[i]);
				if(freq>0)
					map.put(input[i], freq+1);
			}
		}
		
		for(int x: input)
		{
			if(map.containsKey(-x))
			{
				System.out.println(x+" "+-x);
				int freq=map.get(x);
				if(freq==1)
					map.remove(x);
				else
				map.put(x,freq-1);
			}
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
		zeroPair(a);
		
	}
}

