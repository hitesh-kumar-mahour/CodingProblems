package assignment6recursion1;

import java.util.Scanner;

public class isString1reverseOfString2 {
	public static boolean is_reverse(String a, String b)
	{
		if(a.length()!=b.length())
			return false;
		if(a.length()==0)
			return true;
		if(a.charAt(0)==b.charAt(b.length()-1))
			return is_reverse(a.substring(1), b.substring(0, b.length()-1));
		
		return false;
	}
	
	public static void main(String[] args) {

	    Scanner s= new Scanner(System.in);
	    System.out.print("enter string1:");
	   String  a= s.nextLine();
	   System.out.print("enter string2:");
	   String  b=s.nextLine();
	   boolean ans=is_reverse(a,b);
	 
	   System.out.println(ans);
	
	}

}

