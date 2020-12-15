package lec4_array_string;

import java.util.Scanner;


public class palidrome {
	
	public static boolean is_palindrome(String a)
	{
		for(int i=0,j=a.length()-1;j>=0;i++,j--)
		{
		if(a.charAt(i)!=a.charAt(j))
			return false;
		
		}
	 return true;
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
