package gfg;

public class CoinChangeProblem {
//    https://www.geeksforgeeks.org/coin-change-dp-7/
	
    public long count(int []a, int n, int sum) { 
        
        long [][]t=new long[n+1][sum+1];
        
        for(int i=0;i<=n;i++)   t[i][0]=1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                int curr = a[i-1];
                if(j<curr)
                    t[i][j]=t[i-1][j];
                else
                    t[i][j]=t[i-1][j]+t[i][j-curr];
            }
        }
        
        // for(int i=0;i<=n;i++)
        //     System.out.println(Arrays.toString(t[i]));
        return t[n][sum];
    } 
}
