package gfg;

public class DistinctOcurrenceofPSubsequenceInS {
	
//	https://practice.geeksforgeeks.org/problems/distinct-occurrences/1
//	https://www.youtube.com/watch?v=9yV6Elqvblw&ab_channel=codebix
	
    public static int subsequenceCount(String s, String p){
    	
	    int [][]dp=new int [p.length()+1][s.length()+1];
	    
	    for(int i=0;i<=s.length();i++) dp[0][i]=1;
	    
	    for(int i=1;i<=p.length();i++){
	        for(int j=1;j<=s.length();j++){
	            
	            if(s.charAt(j-1)!=p.charAt(i-1))
	                dp[i][j]=dp[i][j-1];
	           else
	                dp[i][j]=(dp[i-1][j-1]+dp[i][j-1])%1000000007;
	               
	        }
	    }
	    
	    return dp[p.length()][s.length()];
	
    }

}
