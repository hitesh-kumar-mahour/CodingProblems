package assignment7recursion2;

import java.util.Scanner;

public class consecutiveDuplicates {

	public static String removeDuplicate(String a)
	{
		if(a.length()<=1)
			return "";
		
		
		if(a.charAt(0)==a.charAt(1))
			return a.charAt(0)+removeDuplicate(a.substring(2));
	
		return a.charAt(0)+removeDuplicate(a.substring(1));
	}
	
	
	public static void main(String[] args) {
			
			Scanner s= new Scanner(System.in);
			System.out.print("enter string:");
			String  a= s.nextLine();
			System.out.println(removeDuplicate(a));
	
		}
}
