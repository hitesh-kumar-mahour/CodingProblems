package assignment8recursion3;

import java.util.Arrays;
import java.util.Scanner;

public class subsetWithSum {

//	Time=O(n*k) Space=O(n*k)
	private static boolean subset(int [] a, int k) {
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
		
		for (int i = 0; i < t.length; i++) {
			System.out.println(Arrays.toString(t[i]));
		}
		
		return t[t.length-1][t[0].length-1];
	}
	
	public static void main(String[] args) {
		int []a= {3, 34, 4, 12, 5, 2};
		int sum=9;
		System.out.println(subset(a,sum));
	}	
	
	

}