package gfg;

public class MaxSumArrayNoTwoConsecutive {

//	https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
	//Time=O(n) Space=O(1)
    
	public static int findMaxSum(int a[], int n){
    
		int in=0, ex=0, max=0;        
        
		for(int i=0;i<n;i++){
   
			int curr_in=ex+a[i];
            int curr_ex=Math.max(in,ex); 
            max=Math.max(curr_in,curr_ex);
            in=curr_in;
            ex=curr_ex;
        }
        
        return max;
    }
	
}
