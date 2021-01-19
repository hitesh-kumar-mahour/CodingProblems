package gfg;

public class ProductArray {

//	https://www.geeksforgeeks.org/a-product-array-puzzle/
//    Time = O(n), space=O(1)
	public static long[] productExceptSelf(int[] a, int n) 
	{ 
        long [] ans = new long [n];
        
        for(int i=0;i<n;i++){
            ans[i]=1;
        }
        
        long t=1;
        for(int i=0;i<n;i++){
            ans[i] = t * ans[i];
            t = t * a[i];
        }
        
        t=1;
        for(int i=n-1;i>=0;i--){
            ans[i] = t * ans[i];
            t = t * a[i];
        }
        
        return ans;
        // 10      3     5       6       2
        // 1       10    10*3    10*3*5*2  3*10*5*6
        
	} 
}
