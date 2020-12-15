package assignment6recursion1;

import java.util.Scanner;

public class Q11 {
	public static String insert(String a)
	{
		if(a.length()<=1)
			return a;
		if(a.charAt(0)==a.charAt(1))
			return a.charAt(0)+"*"+insert(a.substring(1));
		
		return a.charAt(0)+insert(a.substring(1));
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("enter string:");
		String  a= s.nextLine();
		 System.out.println(insert(a));
 }

}
