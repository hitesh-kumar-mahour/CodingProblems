package prc;

import java.util.*;


public class Abc {


	public static boolean is_palindrome(String a)
	{
		for(int i=0,j=a.length()-1;j>=0;i++,j--)
		{
		if(a.charAt(i)!=a.charAt(j))
			return false;
		
		}
	 return true;
	}
	
	public static String[] Subsequence(String a)
	{
		if(a.length()<=0)
		{
			String []Output={""};
		return Output;
		}
		String smallOutput[]=Subsequence(a.substring(1));
		String Output[]= new String[2*smallOutput.length];
		
		for(int i=0;i<smallOutput.length;i++)
		{
			Output[i]=smallOutput[i];
		}
		for(int i=0;i<smallOutput.length;i++)
		Output[smallOutput.length+i]=a.charAt(0)+smallOutput[i];
		
		return Output;
	}
	
	public static void printSubsequences(String input,String decisionSoFar)
	{
		if(input.length()==0)
		{
			System.out.println(decisionSoFar);
			return;
		}

		printSubsequences(input.substring(1), decisionSoFar);
		printSubsequences(input.substring(1), decisionSoFar+input.charAt(0));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("enter string:");
		String  a= s.nextLine();
		String[] all_subs=Subsequence(a);
		int min_hit=Integer.MAX_VALUE;
		for(int i=0;i<all_subs.length;i++) {
			if(is_palindrome(all_subs[i])) {
				int curr_hits=a.length()-all_subs[i].length();
				System.out.println(all_subs[i]+"-- hits req="+curr_hits);
				min_hit=Math.min(min_hit, curr_hits);
			}
		}
		
		System.out.println("min hits ="+min_hit);
		
		
		
//		System.out.println(Subsequence(a));
//		boolean ans=is_palindrome(a);
//		   if (ans==true)
//			   System.out.println(a+" is palindrome");
//		   else
//			   System.out.println(a+ " is not palindrome" );
	
	}

}
