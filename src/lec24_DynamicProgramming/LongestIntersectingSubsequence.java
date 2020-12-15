package lec24_DynamicProgramming;

import java.util.Scanner;

public class LongestIntersectingSubsequence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		int[]d=new int[n];
		LIS(a,n,0,d);
		int l=d[0];
		for (int i = 1; i < d.length; i++) {
			l=Math.max(l,d[i]);
		}
		System.out.println(l);
		
	}

	private static void LIS(int[] a, int n,int i,int[]d) {
		if(i>=n)
			return ;
		
		int max=0;
		
		for (int j = i+1; j < n; j++) 
		{
			if(d[j]==0)
				LIS(a, n, j, d);
			
			if(a[j]>a[i] && max<d[j] )
				max=d[j];
		}
		
		d[i]=max+1;
	}
}
