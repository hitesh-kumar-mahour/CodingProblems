package assignment6recursion1;

import java.util.Scanner;

public class checkPalindrome {
	
	public static boolean is_palindrome(String a)
	{
		if(a.length()==1/*for odd length string*/||a.length()==0/*for even*/)
			return true;
		if(a.charAt(0)==a.charAt(a.length()-1))
			return is_palindrome(a.substring(1, a.length()-1));
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.print("enter string:");
   String  a= s.nextLine();
   boolean ans=is_palindrome(a);
 
   if (ans==true)
	   System.out.println(a+" is palindrome");
   else
	   System.out.println(a+ " is not palindrome" );
	
	}
}
