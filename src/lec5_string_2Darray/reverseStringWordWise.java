package lec5_string_2Darray;

import java.util.Scanner;

public class reverseStringWordWise {
// "welcome to coding ninjas" to "ninjas coding to welcome
	
	public static void reverse(String a)
	{
		int i;
		for( i=0;i<a.length()&&a.charAt(i)!=' ';i++)
		{
			;
		}
		if(i<a.length())
		reverse(a.substring(i+1));
		
		System.out.print(a.substring(0,i)+" ");
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter multi word string:");
		   String  a= s.nextLine();
		   reverse(a);
	}

}
