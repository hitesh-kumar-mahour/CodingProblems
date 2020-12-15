package gfg;

import java.util.Scanner;
//http://www.geeksforgeeks.org/maximum-product-subarray/
public class MaximumProductSubarray {

	public static int maxProductkadaneAlgo(int[]a)
	{
//		time complexity O(a.length)
//		space complexity O(1)		
		int curr_max = 1;
	    int curr_min = 1;
	    int max = 1;
	
	    for (int i = 0; i < a.length; i++)
	    {
	 
	        if (a[i] > 0)
	        {
	            curr_max = curr_max*a[i];
	            curr_min = Math.min (curr_min * a[i], 1);
	        }
	 

	        else if (a[i] == 0)
	        {
	            curr_max = 1;
	            curr_min = 1;
	        }
	 
	        else
	        {
	            int temp = curr_max;
	            curr_max = Math.max (curr_min * a[i], 1);
	            curr_min = temp * a[i];
	        }

	    
	        max  = Math.max(curr_max, max);
	    }
	 
	    return max;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
		int size=s.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();

	System.out.println(maxProductkadaneAlgo(a));
		t--;
		}
	}
}

