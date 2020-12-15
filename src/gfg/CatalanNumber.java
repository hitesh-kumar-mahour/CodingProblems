package gfg;

import java.util.Scanner;

public class CatalanNumber {

	
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(catalan_number(n, new int[n+1]));
	}
	
	public static int catalan_number (int n,int[]a)
	{
	    if(n==0)
	    {
	        a[0]=1;
	        return 1;
	    }
	    
	    if(a[n-1]==0)
	        catalan_number(n-1,a);
	   
	   int x=0;
	   for(int i=0;i<n;i++)
	   {
	       x=x+(a[i]*a[n-1-i]);
	   }
	   
	   a[n]=x;
	   return x;
	}
}
