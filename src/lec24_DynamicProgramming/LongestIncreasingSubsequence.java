package lec24_DynamicProgramming;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
		    int n=s.nextInt();
		    int []a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=s.nextInt();
		    }
		    System.out.println(lis(a));//longest increasing subsequence
		    System.out.println(lds(a));//longest decreasing subsequence
		    
		}
	}
	
	public static int lis(int[]a)
	{
	   // int max=0;
	   int [] p=new int[a.length];
	   
	    for(int i=0;i<a.length;i++)
	    {
	        int max=0;
	        for(int j=0;j<i;j++)
	        {
	            if(a[j]<a[i])
	                max=Math.max(p[j],max);
	        }
	        p[i]=max+1;
	    }
	    
	    int max=0;
	    for(int i:p)
	    {	
	    	max=Math.max(i,max);
//	        System.out.print(i+" ");
	    }
	    return max;
	}
	
	public static int lds(int[]a)
	{
	   // int max=0;
	   int [] p=new int[a.length];
	   
	    for(int i=a.length-1;i>=0;i--)
	    {
	        int max=0;
	        for(int j=i+1;j<a.length;j++)
	        {
	            if(a[j]<a[i])
	                max=Math.max(p[j],max);
	        }
	        p[i]=max+1;
	    }
	    
	    int max=0;
	    for(int i:p)
	    {	
	    	max=Math.max(i,max);
	        System.out.print(i+" ");
	    }
	    return max;
	}
		
}
