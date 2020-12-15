package assignment7recursion2;

import java.util.Scanner;

public class Bonus2 {

	
	public static void print_all_possible_strings_of_length_k(String a, int k,String decisionSoFar) 
	{
		if(a.length()==0)
			return;
		
		if(decisionSoFar.length()==k)
		{
			System.out.println(decisionSoFar);
			return;
		}
		
		for(int i=0;i<a.length();i++)
		{
			print_all_possible_strings_of_length_k(a, k, decisionSoFar+a.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		int k=s.nextInt();
		print_all_possible_strings_of_length_k(a,k,"");
	}

}
