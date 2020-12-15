package gfg;

import java.util.ArrayList;
import java.util.Scanner;

public class TrappingRainWater {
	
	public static int fun(int[]a) {
	    
	    int ans=0;
	    int []l_max=new int[a.length];
	    int []r_max=new int[a.length];
	    for(int i=1 ;i<a.length;i++)
	        l_max[i]=Math.max(a[i-1],l_max[i-1]);
	    for(int i=a.length-2 ;i>=0;i--)
	        r_max[i]=Math.max(a[i+1],r_max[i+1]);
	  
	    for(int i=0;i<a.length;i++)
	        ans+=Math.max(0,Math.min(l_max[i],r_max[i])-a[i]);
	    return ans;

	}
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
		    int n=s.nextInt();
		    int[]a=new int[n];
		    for(int i=0;i<n;i++)
		        a[i]=s.nextInt();
		    System.out.println(fun(a));
		}
	}

}
