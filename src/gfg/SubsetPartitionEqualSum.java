package gfg;

public class SubsetPartitionEqualSum {

//	https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1
	
    //Time O(n^2)  Space O(n^2)
    public static boolean equalPartition(int n, int a[]){
        
        int sum = 0;
        for(int i=0;i<n;i++)    
            sum+=a[i];
        
        if(sum%2!=0)
            return false;
		
		return subsetSum(a,sum/2);

    }
	
	
	private static boolean subsetSum(int [] a, int k) {
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
		
// 		for (int i = 0; i < t.length; i++) {
// 			System.out.println(Arrays.toString(t[i]));
// 		}
		
		return t[t.length-1][t[0].length-1];
	}
    
}
