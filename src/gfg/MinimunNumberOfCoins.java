package gfg;

public class MinimunNumberOfCoins {

	
//	https://practice.geeksforgeeks.org/problems/number-of-coins1824/1
	
	public int minCoins(int coins[], int M, int V) { 
	    
	    int[][]dp = new int [M+1][V+1];

	    for(int j=1;j<=V;j++) 
	            dp[0][j]=-1; 
	    
	    for(int i=1;i<=M;i++){
    	     for(int j=1;j<=V;j++){
    	        if(j<coins[i-1]) 
    	            dp[i][j]=dp[i-1][j];
    	        else{
    	        	if(dp[i-1][j]!=-1 && dp[i][j-coins[i-1]]!=-1)
     	                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i-1]]+1);
    	        	else if(dp[i-1][j]==-1 && dp[i][j-coins[i-1]]==-1)
    	                dp[i][j]=-1;
    	        	else if(dp[i][j-coins[i-1]]==-1)
    	        	   	dp[i][j]=dp[i-1][j];
    	        	else dp[i][j]=dp[i][j-coins[i-1]]+1;
    	        }
    	     }
	    }
	    return dp[M][V];
	} 
}
