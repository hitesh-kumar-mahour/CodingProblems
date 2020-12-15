package lec24_DynamicProgramming;

import java.util.Scanner;

public class LongestBitonicSubsequence {

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
		    System.out.println(lbs(a));
		    
		}
	}
	
	
	public static int lbs(int[]a)
	{
		//longest decreasing subsequence
		int [] lds=new int[a.length];
	    for(int i=a.length-1;i>=0;i--)
	    {
	        int max=0;
	        for(int j=i+1;j<a.length;j++)
	        {
	            if(a[j]<a[i])
	                max=Math.max(lds[j],max);
	        }
	        lds[i]=max+1;
	    }
	    
	    //longest increasing subsequence
	    int [] lis=new int[a.length];   
	    for(int i=0;i<a.length;i++)
	    {
	        int max=0;
	        for(int j=0;j<i;j++)
	        {
	            if(a[j]<a[i])
	                max=Math.max(lis[j],max);
	        }
	        lis[i]=max+1;
	    }
	    
	    //longest bitonic subsequence
	    int max=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	max=Math.max(lis[i]+lds[i]-1,max );
	    }
	    
	    return max;
	    
	}
}
