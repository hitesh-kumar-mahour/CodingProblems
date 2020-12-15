package assignment7recursion2;

import java.util.Scanner;

public class paranthresisString {

	public static String paraString(String a)
	{
		if(a.length()<=0)
			return "";
		if(a.charAt(0)=='(')
		{
			int i=0;
			while( a.charAt(i)!=')')
				i++;
			
			return a.substring(0,i+1);
		}
		return paraString(a.substring(1));
			
	}
public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("enter string:");
		String  a= s.nextLine();
		System.out.println(paraString(a));
	}
}
