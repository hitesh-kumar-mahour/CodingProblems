package lec9recursivePrint;

import java.util.Scanner;



public class StringSubsequences {

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
   System.out.println("enter string");
   String input=s.nextLine();
   printSubsequences(input,"");
   
	}
}
