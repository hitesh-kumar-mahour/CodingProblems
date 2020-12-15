package assignment6recursion1;

import java.util.Scanner;

public class replaceOccurenceOfX {
	
	public static String removeX(String a)
	{
		if(a.length()<=0)
		 return a;
		
		if(a.charAt(0)=='x')
			return removeX(a.substring(1));
		
		return a.charAt(0)+removeX(a.substring(1));
		
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("enter string:");
		String  a= s.nextLine();
		 System.out.println(removeX(a));
 }
}