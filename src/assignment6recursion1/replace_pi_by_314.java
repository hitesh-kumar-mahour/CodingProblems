package assignment6recursion1;

import java.util.Scanner;

public class replace_pi_by_314 {
	public static String replacePI(String a)
	{
		if(a.length()<=1)
			return a;
		if(a.substring(0,2).equals("pi"))
			return 3.14+replacePI(a.substring(2));
	
		return a.charAt(0)+replacePI(a.substring(1));
	}

	public static void main(String[] args) {
		
//		Scanner s= new Scanner(System.in);
//		System.out.print("enter string:");
//		   String  a= s.nextLine();
//		   System.out.println(replacePI(a));
		 String b="hi";
		 System.out.println(b.substring(1));

			}


}
