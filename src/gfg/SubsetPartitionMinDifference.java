package gfg;

public class SubsetPartitionMinDifference {

//	https://www.geeksforgeeks.org/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/	
	
	public static int minDiffernce(int a[], int n) { 
	    int sum=0;
	    for(int i=0;i<n;i++)
	        sum+=a[i];
	    
	    boolean[][] t  = subsetSum(a,sum/2);
	    
	    int i;
	    for(i=t[0].length-1;i>=0 && !t[t.length-1][i];i--);
	    
	    return sum-2*i;     
	    
	}
	
	private static boolean[][] subsetSum(int [] a, int k) {
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
		
// 		for (int i = 0; i < t.length; i++)
// 			System.out.println(Arrays.toString(t[i]));
		
		return t;
	}
}
