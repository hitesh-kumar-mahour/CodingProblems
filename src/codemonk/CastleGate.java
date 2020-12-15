package codemonk;

import java.util.Scanner;

public class CastleGate {

	 public static void main(String args[] ) throws Exception {
	       
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();

	        for (int p = 0; p < t; p++) 
	        {
	        	int n=s.nextInt();
	        	
	        	int []a=new int[n];
	        	for(int i=0;i<n;i++)
	        		a[i]=i+1;
	        		
	            	// for(int i=0;i<n;i++)
	            	// System.out.println(a[i]);
	        
	        	int count=0;
	        		
	            for(int i=0;i<n-1;i++)
	            {
	            	for(int j=i+1;j<n;j++)
	            	{
	            		if((a[i]^a[j])<=n)
	            			count++;
	            		
	            	}
	            }
	            System.out.println(count);
	        }
	        

	        // System.out.println("Hello World!");
	    }
}
