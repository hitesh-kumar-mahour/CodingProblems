package gfg;

import java.util.Scanner;

public class LargestSumContiguousSubarrayKadaneAlgo {

	private static int fun(int[] a) {
//		time complexity O(n^2)
//		space complexity O(n^2)
		int[][]b=new int[a.length][a.length];
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			b[i][i]=a[i];
			max=Math.max(max,a[i]);
		}
		
		
		for (int j = 1; j < b.length; j++) 
		{
			for(int i=j-1;i>=0;i--)
			{
				b[i][j]=b[i][j-1]+b[i+1][j]-b[i+1][j-1];
				max=Math.max(max, b[i][j]);
			}
		}
		
		return max;
		
	}
	
	public static int kadaneAlgo(int[]a)
	{
//		time complexity O(n)
//		space complexity O(1)		
		int max = a[0], curr_max = a[0];
		 
	    for (int i = 1; i < a.length; i++)
	    {
	    	curr_max=Math.max(a[i], curr_max+a[i]);
	    	max=Math.max(curr_max,max);
	    	
	    }
	    return max;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
	
//		System.out.println(fun(a));
	System.out.println(kadaneAlgo(a));
	}

	
}
