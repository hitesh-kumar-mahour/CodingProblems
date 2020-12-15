package assignment7recursion2;

import java.util.Scanner;

public class parenthesisCount {
	
	public static boolean paraCount(String a,int count)
	{
		if(a.length()==0)
		{
			if(count==0)
				return true;
			else
				return false;
		}
		if(count<0)
			return false;
		if(a.charAt(0)=='(')
		{
			count++;
			return paraCount(a.substring(1),count);
		}
		if(a.charAt(0)==')')
		{
			count--;
			return paraCount(a.substring(1),count);
		}
		else
			return paraCount(a.substring(1),count);
	}
	
public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("enter string:");
		String  a= s.nextLine();
		System.out.println(paraCount(a,0/*count*/));
	}

}
