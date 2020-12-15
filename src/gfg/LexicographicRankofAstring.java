package gfg;

import java.util.Scanner;

public class LexicographicRankofAstring {
//http://www.geeksforgeeks.org/lexicographic-rank-of-a-string/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{	
			String a=s.next();
			boolean flag=false;
			for(int i=0;i<a.length()-1;i++)     // check for duplicate characters in string
			{
				if(!flag)
				{
					for(int j=i+1;j<a.length();j++)
					{
						if(a.charAt(i)==a.charAt(j))
						{
							System.out.println(0);
							flag=true;
							break;
						}
						
					}
				}
			}
				
			if(!flag)
			System.out.println(lexico_rank(a,a,"",1)% 1000003);
	
		t--;
		}
	}

	private static int lexico_rank(String original, String curr, String decision_so_far, int rank)
	{
		if(curr.length()==0)
		{
			if(decision_so_far.compareTo(original)<0)
				return (rank+1);
			else
				return rank;
		}
		
		for (int i = 0; i <=decision_so_far.length(); i++) 
		{
			rank=Math.max(rank, lexico_rank(original, curr.substring(1), decision_so_far.substring(0,i)+curr.charAt(0)+decision_so_far.substring(i), rank));
		}
		return rank;
	}
}
