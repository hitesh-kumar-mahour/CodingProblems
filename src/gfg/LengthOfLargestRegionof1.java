package gfg;

import java.util.Scanner;

public class LengthOfLargestRegionof1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();//rows
		int m=s.nextInt();//cols
		int[][]a =new int[n][m];
		
		for (int i = 0; i < a.length; i++) 
			for (int j = 0; j < a[i].length; j++) 
				a[i][j]=s.nextInt();
		
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
		
			System.out.println();
		}
		
		System.out.println(findMaxLength(a, n, m));
	
	}
	
	
	public static int dfs(int a[][],int i,int j, boolean visited[][],int N,int M)
	{	
		if(a[i][j]==0|| visited[i][j])
			return 0;
	
		int count=1;
		visited[i][j]=true;
		
	    if(i+1<N)
	    	count+=dfs(a,i+1,j,visited,N,M);
	    
	     if(i-1>=0)
	    	 count+= dfs(a,i-1,j,visited,N,M);
	    
	     if(j+1<M)
	    	 count+= dfs(a,i,j+1,visited,N,M);
	    
	     if(j-1>=0)	 
	    	 count+=dfs(a,i,j-1,visited,N,M);
	    
	     if(i-1>=0 && j-1>=0)
	    	 count+=dfs(a,i-1,j-1,visited,N,M);
	    
	     if(i-1>=0 && j+1<M)	      
	        count+=dfs(a,i-1,j+1,visited,N,M);
	    
	     if(i+1<N && j-1>=0)
	    	 count+=dfs(a,i+1,j-1,visited,N,M);
	    
	     if(i+1<N && j+1<M)
	    	 count+=dfs(a,i+1,j+1,visited,N,M);
	    
	     
	     return count;
	}

	public static int findMaxLength(int a[][],int N,int M)
	{
		int max=0; 
		boolean [][]visited =new boolean[N][M];  
	    for(int i=0;i<N;i++)
	    {
	      for(int j=0;j<M;j++)
	      {  
	             max=Math.max(dfs(a,i,j,visited,N,M),max);
	      }
	    }
	    
	    return max;
	}
}

/*
10 3
0 0 1 1 1 0 1 0 1 1 1 1 0 1 0 0 1 0 1 0 1 0 0 1 0 0 0 1 1 1 
*/

/*
4 5
0 0 1 1 0
1 0 1 1 0
0 1 0 0 0 
0 0 0 0 1
*/