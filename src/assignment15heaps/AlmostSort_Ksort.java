package assignment15heaps;

import java.util.Scanner;

import lec21_PriorityQ.MinHeap;
import lec3.array_use;

public class AlmostSort_Ksort {

	public static void k_sort(int[]a,int k) throws Exception
	{
		MinHeap<Integer> heap=new MinHeap<>();
	int i;
		for( i=0;i<k;i++)
		{
			heap.insert(a[i], a[i]);
		}
		
		for( i=k;i<a.length;i++)
		{
		   a[i-k]=heap.remove();
		   heap.insert(a[i], a[i]);
		}
		
		i=a.length-k;
		while(!heap.isEmpty())
		{
			a[i]=heap.remove();
			i++;
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		
	int input[]=array_use.input_array();
	Scanner s= new Scanner(System.in);
	System.out.println("enter k");
	int k=s.nextInt();
	k_sort(input, k);
	array_use.print_array(input);
	
	}
}
