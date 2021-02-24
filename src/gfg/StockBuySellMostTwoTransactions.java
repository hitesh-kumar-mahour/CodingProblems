package gfg;

import java.util.Arrays;

public class StockBuySellMostTwoTransactions {

	public static int maximumProfit(int []a) {
		 
        int[] dp=new int [a.length];
        
        int min = a[0];    
        for(int i=1;i<a.length;i++){
            dp[i]=Math.max(dp[i-1],a[i]-min);
            min = Math.min(a[i],min);
        }
        
        System.out.println(Arrays.toString(dp));
        
        int max=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            dp[i]=Math.max(dp[i+1],dp[i]+max-a[i]);
            max = Math.max(a[i],max);
        }
    
        System.out.println(Arrays.toString(dp));

        return dp[0];
	}
	
	public static void main(String[] args) {
	
		int []a= {9,21,5,75,65,80};
		maximumProfit(a);
	}
}
