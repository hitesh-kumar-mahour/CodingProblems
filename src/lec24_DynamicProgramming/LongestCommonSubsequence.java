package lec24_DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		System.out.println(LCSwithoutDP(a,b,""));
		System.out.println(LCS_DP(a,b));
	}

	private static int LCS_DP(String a,String b)
	{
		int [][]x=new int[a.length()+1][b.length()+1];
	
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				
				if(i==0||j==0)
					x[i][j]=0;
				else if(a.charAt(i-1)==b.charAt(j-1))
					x[i][j]=x[i-1][j-1]+1;
				
				else x[i][j]=Math.max(x[i-1][j],x[i][j-1]);
			}
		}
		
		return x[a.length()][b.length()];
	}
	
	
	private static String LCSwithoutDP(String a, String b, String d) {
		
		if(a.length()==0||b.length()==0)
			return d;
		
		if(a.charAt(0)==b.charAt(0))
			return LCSwithoutDP(a.substring(1),b.substring(1),d+a.charAt(0));
		
		String s1=LCSwithoutDP(a.substring(1),b,d);
		String s2=LCSwithoutDP(a,b.substring(1),d);
		
		if(s1.length()>s2.length())
			return s1;
		else return s2;
	}
}
