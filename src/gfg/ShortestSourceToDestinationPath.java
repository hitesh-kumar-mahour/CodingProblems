package gfg;

import java.util.Scanner;

public class ShortestSourceToDestinationPath {

//	https://practice.geeksforgeeks.org/problems/shortest-source-to-destination-path/0#
	
	public static void main (String[] args) {
		
	    Scanner s = new Scanner(System.in);
	    for(int t=s.nextInt();t>0;t--){
	        
	        int m=s.nextInt(),n=s.nextInt();
	        
	        boolean [][]a=new boolean[m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++)
	               if(s.nextInt()==1)
	                    a[i][j]=true;
	        }
	        
	        int [][]d=new int [m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++)
	               d[i][j]=Integer.MAX_VALUE;
	        }
	        
	        int p=s.nextInt(),q=s.nextInt();
	        
	        if(!a[0][0] || !a[p][q]){
	            System.out.println(-1);
	            continue;
	        }
	       
	        int ans = fun(a,d,0,0,p,q);
	        if(ans==Integer.MAX_VALUE)
	            System.out.println(-1);
	        else
	            System.out.println(ans);
	        
	    }
	}
	
	public static int fun(boolean [][]a,int [][]d,int i,int j ,int p, int q){
	    
	    if(i<0||i>=a.length||j<0||j>=a[0].length)
	        return Integer.MAX_VALUE;
	  	
	  	if(!a[i][j])
	  	    return d[i][j];
	  	
	  	a[i][j]=false;
	  	
	    if(i==p && j==q){
	        d[i][j]=0;
	        return d[i][j];
	    }
	  	
	    int min=Integer.MAX_VALUE;
	    min=Math.min(min,fun(a,d,i,j+1,p,q));
	    min=Math.min(min,fun(a,d,i,j-1,p,q));
        min=Math.min(min,fun(a,d,i+1,j,p,q));
	    min=Math.min(min,fun(a,d,i-1,j,p,q));
	    
	    if(min==Integer.MAX_VALUE)
	        d[i][j]=Integer.MAX_VALUE;
	    else
	        d[i][j]=min+1;
	       
	   return d[i][j];
	    
	}
}
