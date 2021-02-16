package gfg;

import java.util.ArrayList;
import java.util.Scanner;

public class TrappingRainWater {
	
	//Time O(n), Space O(1)
	public static int fun(int[]a) {
	    
		int n=a.length;
	    
        if(n<=2) return 0;
        
        int l=0,r=n-1,l_max=0,r_max=0,water=0;
        
        while(l<=r){
            
            if(a[l]<=a[r]){
                water+=Math.max(0,l_max-a[l]);
                l_max=Math.max(l_max,a[l]);
                l++;
            }
            else{
                water+=Math.max(0,r_max-a[r]);
                r_max=Math.max(r_max,a[r]);
                r--;
            }
        }
        return water;

	}
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
		    int n=s.nextInt();
		    int[]a=new int[n];
		    for(int i=0;i<n;i++)
		        a[i]=s.nextInt();
		    System.out.println(fun(a));
		}
	}

}
