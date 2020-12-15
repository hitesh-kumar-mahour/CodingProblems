package gfg;

import java.util.Scanner;

public class LongestPalindromeSubsequence {

	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
		    String st=s.next();
		    int[][]a=new int[st.length()][st.length()]; 
		    fun(st,a);
		    
		    for (int i = 0; i < a.length; i++) {
				
		    	for (int j = 0; j < a.length; j++) {
					System.out.print(a[i][j]+" ");
				}
		    	System.out.println();
			}
		    
		    System.out.println(a[0][a.length-1]);
		}
	}

	private static void fun(String st, int[][] a) {
		
		int n=st.length();
		int p=0,q=0,curr_max=0;
		
		for(int t=0;t<n;t++)
		{
			for(int i=0,j=i+t;j<n;j++,i++)
			{
				if(i==j)
					a[i][j]=1;
				else if(st.charAt(i)==st.charAt(j))
					a[i][j]=a[i+1][j-1]+2;
				else
					a[i][j]=Math.max(a[i][j-1],a[i+1][j]);
				
				if(a[i][j]>curr_max)
				{
					curr_max=a[i][j];
					p=i;q=j;
				}
			}
		}
		System.out.println(st.substring(p,q+1));
	}
}
