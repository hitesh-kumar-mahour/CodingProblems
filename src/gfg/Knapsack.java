package gfg;

public class Knapsack {
//	https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
	//Time O(n^2), Space O(n^2)
    static int knapSack(int W, int w[], int v[], int n) { 
        
        int[][]dp=new int [n+1][W+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                
                if(j<w[i-1])
                    dp[i][j]=dp[i-1][j];
                else{
                    dp[i][j]=Math.max(dp[i-1][j],v[i-1]+dp[i-1][j-w[i-1]]);
                }
            }
        }
        
         return dp[n][W];
    } 
}
