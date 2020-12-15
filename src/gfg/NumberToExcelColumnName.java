package gfg;

import java.util.Scanner;

public class NumberToExcelColumnName {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int n=s.nextInt();
			String c =find_col(n);
			System.out.println(c);
			t--;
		}
	}

	public static char col(int n)
	{
		if(n==0)
			return 'Z';
		
		return (char)(n+64);
	}
	private static String find_col(int n) 
	{
		String ans="";
		
		while(n!=0)
		{
			ans=col(n%26)+ans;
			
			if(n%26==0)
				n= n/26 -1;
			else
				n=n/26;
		}
		
		return ans;
	}
}
