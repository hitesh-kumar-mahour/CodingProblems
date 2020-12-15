package assignment7recursion2;

import java.util.Scanner;

public class reverseString {

	public static String reverse(String input)
	{
		if(input.length()<=0)
			return "";
		
		return reverse(input.substring(1))+input.charAt(0);
	}
	
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter string to be reversed ");
		String input=s.nextLine();
		String output=reverse(input);
		System.out.println(output);
	}
}

