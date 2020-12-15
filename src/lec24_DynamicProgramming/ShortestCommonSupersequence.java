package lec24_DynamicProgramming;

import java.util.Scanner;

public class ShortestCommonSupersequence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		System.out.println(SCSwithoutDP(a,b,""));
//		System.out.println(SCS_DP(a,b));
	}
	
	private static int SCS_DP(String a,String b)
	{
		int [][]x=new int[a.length()+1][b.length()+1];
	
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				
				if(i==0)
					x[i][j]=j;
				else if(j==0)
					x[i][j]=i;
				
				else if(a.charAt(i-1)==b.charAt(j-1))
					x[i][j]=x[i-1][j-1]+1;
				
				else x[i][j]=Math.min(x[i-1][j],x[i][j-1])+1;
			}
		}
		
		return x[a.length()][b.length()];
	}
	
	private static String SCSwithoutDP(String a, String b, String d) {
		
		if(a.length()==0)
			return d+b;
		if(b.length()==0)
			return d+a;
		
		
		if(a.charAt(0)==b.charAt(0))
			return SCSwithoutDP(a.substring(1),b.substring(1),d+a.charAt(0));
		String s1=SCSwithoutDP(a.substring(1),b,d+a.charAt(0));
		String s2=SCSwithoutDP(a,b.substring(1),d+b.charAt(0));
		
		if(s1.length()==s2.length())
			{
				if(s1.compareTo(s2)>0)
					return s2;
				else
					return s1;
			}
		if(s1.length()>s2.length())
			return s2;
		else
			return s1;
	}
}
