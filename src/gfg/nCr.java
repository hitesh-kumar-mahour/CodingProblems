package gfg;

import java.util.Scanner;

public class nCr {	
	
	// DP approach to calculate nCr
	public static long nCr(int n, int r) { 
		
		long[] C = new long[r + 1]; 
		C[0] = 1; // nC0 is 1 
		for (int i = 1; i <= n; i++) { 
	  
	    // Compute next row of pascal triangle using 
	    // the previous row 
	    for (int j = Math.min(i, r); j > 0; j--) 
	    		C[j] = (C[j] + C[j - 1]) ;//% 1000000007; 
		} 
	  return C[r]; 
	} 
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		for(int t=s.nextInt();t>0;t--)
		{
		    int n=s.nextInt();
		    int r=s.nextInt();
		    System.out.println(nCr(n,r));
		}
	}
}
