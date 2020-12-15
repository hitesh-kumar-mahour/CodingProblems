package gfg;

import java.util.Scanner;
//http://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/
public class MaxSumInTheConfiguration {

	public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			while(t>0)
			{
			int size=s.nextInt();
			int[] a=new int[size];
			for(int i=0;i<size;i++)
				a[i]=s.nextInt();
	
		System.out.println(fun(a));
			t--;
			}
		}

	private static int fun(int[] a) {
		
		int sum=0,max=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			max+=a[i]*i;
		}
		
		int curr_max=max;
		
		for (int i = 1; i < a.length; i++) {
			curr_max+=a[i-1]*a.length-sum;
			max=Math.max(max, curr_max);
		}
		
		return max;
	}
}
