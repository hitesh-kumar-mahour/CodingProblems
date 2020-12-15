package lec24_DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
			int n1=s.nextInt(),n2=s.nextInt();
			String a=s.next();
			String b=s.next();
			
			System.out.println(fun(a,b));
		}
	}

	private static int fun(String a, String b) {
	
		int[][]arr=new int[a.length()+1][b.length()+1];
		int max=0;
		
		for (int i = 1; i < arr.length; i++)
		{
			for (int j = 1; j < arr[i].length; j++)
			{
				if(a.charAt(i-1)==b.charAt(j-1))
					{
						arr[i][j]=arr[i-1][j-1]+1;	
						max=Math.max(max,arr[i][j]);
					}
			}
		}
	
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		return max;
	}
}
