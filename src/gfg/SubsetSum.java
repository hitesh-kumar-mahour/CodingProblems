package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum {

//	Time=O(n*k) Space=O(n*k)
	private static boolean isSubsetWithSum(int [] a, int k) {
		boolean[][]t=new boolean[a.length+1][k+1];
		
		for(int i=0;i<t.length;i++)
				t[i][0]=true;
		
		for(int i=1;i<t.length;i++) {
			for(int j=1;j<=k;j++) {
				int curr = a[i-1];
				if(curr>j)
					t[i][j]=t[i-1][j];
				else {
					t[i][j]=t[i-1][j-curr] || t[i-1][j];
				}
			}
		}
		
//		for (int i = 0; i < t.length; i++)
//			System.out.println(Arrays.toString(t[i]));
		
		return t[t.length-1][t[0].length-1];
	}
	
//	https://practice.geeksforgeeks.org/problems/perfect-sum-problem5633/1#
	public static int countSubsetWithSum(int a[],int n, int sum) { 
        
        int [][] dp = new int[n+1][sum+1];
        for(int i=0;i<=n;i++)
            dp[i][0]=1;
            
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                
                if(a[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=(dp[i-1][j]+dp[i-1][j-a[i-1]])%1000000007;
            }
            
        }
        
        return dp[n][sum];
	}
	
	public static void main(String[] args) {
		int []a= {3, 34, 4, 12, 5, 2};
		int sum=9;
		System.out.println(isSubsetWithSum(a,sum));
		System.out.println(countSubsetWithSum(a, a.length, sum));
	}	
	
	

}