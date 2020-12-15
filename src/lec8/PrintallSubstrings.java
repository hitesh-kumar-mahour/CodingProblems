package lec8;

import java.util.Scanner;


public class PrintallSubstrings {
	
	public static void printSubstring(String input) {
		for(int i=1;i<=input.length();i++)
		{
			for(int j=0,k=i;k<=input.length();j++,k++)
			{
				System.out.println(input.substring(j,k));
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s= new Scanner(System.in);
   System.out.println("enter string");
   String input=s.nextLine();
   printSubstring(input);
	}

}
