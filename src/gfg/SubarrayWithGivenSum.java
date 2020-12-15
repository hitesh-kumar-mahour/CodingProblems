package gfg;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int size=s.nextInt();
			int sum=s.nextInt();
			int[] a=new int[size];
			
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
//			print_subarray_with_sum_without_negative(a,sum);
			System.out.println(print_subarray_with_sum_with_negative(a,sum));
			t--;
		}
	}

//	https://www.youtube.com/watch?v=HbbYPQc-Oo4&feature=emb_logo&ab_channel=TECHDOSE
	private static int print_subarray_with_sum_with_negative(int[] a, int sum) {
		
		if(a==null || a.length==0)
			return 0;
		int count=0,curr_sum=0;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			curr_sum += a[i];
			if(curr_sum==sum)
				count++;
			count += map.getOrDefault(curr_sum-sum, 0);
			map.put(curr_sum, map.getOrDefault(curr_sum, 0)+1);
		}
		return count;
	}


	public static void print_subarray_with_sum_without_negative(int[]a,int sum){
	    if(a==null || a.length==0){
	           System.out.println(-1);
	           return;
	       }
	    
	    int i=0,j=0,curr_sum=a[i];
	    
	    while(i<a.length && j<a.length){
	        
	       if(i>j){
                curr_sum = a[i];
                j=i;
	       }
	       if(curr_sum==sum){
	           System.out.println((i+1)+" "+(j+1));
	            return;
	       }
	       else if(curr_sum<sum){
	    	   j++;
	    	   if(j<a.length)
	    		   curr_sum+=a[j];
	       }
	       else{
	           curr_sum-=a[i];
	           i++;
	       }
	    }
    	System.out.println(-1);
	}

}
