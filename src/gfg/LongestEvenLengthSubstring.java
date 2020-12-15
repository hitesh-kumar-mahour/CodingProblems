package gfg;

import java.util.Scanner;

public class LongestEvenLengthSubstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
			String a=s.next();
			if(a.length()%2==0)
				System.out.println(fun(a));
			else
				{
					int first=fun(a.substring(0,a.length()-1));
					int second =fun(a.substring(1));
					System.out.println(Math.max(first, second));
						
				}
		}
	}

	private static int fun(String a) {
		
		for (int i = a.length(); i>=2; i-=2)
		{
			for (int j = 0; j <= a.length()-i; j++)
			{
//				System.out.print(i+" ");
				boolean ans=test(a.substring(j,j+i ));
				if(ans)
					return i;
			}
			
		}
		
		
		return 0;
	}

	private static boolean test(String a) {
		
		int m=a.length()/2;
		int countl=0,countr=0;
		
		for(int i=0;i<m;i++)
		{
//			System.out.print(a.charAt(i)+" ");
			countl+=(a.charAt(i)-48);
		}
//			System.out.print("  ");
		for(int i=m;i<a.length();i++)
			{
//				System.out.print(a.charAt(i)+" ");
				countr+=(a.charAt(i)-48);
			}
		
//		System.out.println(countl+" "+countr);
		
		return countl==countr;		
	}
}
