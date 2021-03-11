package gfg;

import java.util.Arrays;

public class LongestSubsequenceOfXWhichIsSubstringOfY {

//	https://www.geeksforgeeks.org/find-length-longest-subsequence-one-string-substring-another-string/
	
    static int maxSubsequenceSubstring(char x[], char y[]) 
    { 
        int dp[][] = new int[y.length+1][x.length+1]; 
       
       
        for (int i = 1; i <= y.length; i++) { 
            for (int j = 1; j <= x.length; j++) { 

                if (x[j - 1] == y[i - 1]) 
                    dp[i][j] = 1 + dp[i - 1][j - 1]; 
                else
                    dp[i][j] = dp[i][j - 1]; 
            } 
        } 
       
        
        for (int i = 1; i <= y.length; i++) 
        		System.out.println(Arrays.toString(dp[i]));
        int ans = 0; 
        for (int i = 1; i <= y.length; i++) 
            ans = Math.max(ans, dp[i][x.length]); 
       
        return ans; 
    } 
      
    public static void main(String[] args) { 
        char x[] = "ABCD".toCharArray(); 
        char y[] = "BACDBDCD".toCharArray(); 
        int n = x.length, m = y.length; 
        System.out.println(maxSubsequenceSubstring(x, y)); 
    } 
}
