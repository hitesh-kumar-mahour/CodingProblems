package assignment7recursion2;

import java.util.Scanner;

public class replaceChracter {
	
	public static String replace(String input,char ch1,char ch2)
	{
		if(input.length()<=0)
		{
			return "";
		}
		String smallOutput=replace(input.substring(1),ch1,ch2);
		if(input.charAt(0)==ch1)
		{
			String output=ch2+smallOutput;
			return output;
		}
		return input.charAt(0)+smallOutput;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string to be reversed ");
		String input=s.nextLine();
		System.out.print("enter character to be replaced: ");
		char ch1= s.next().charAt(0);
		System.out.print("enter character to be replaced by: ");
		char ch2=s.next().charAt(0);
		String output=replace(input,ch1,ch2);
		System.out.println(output);
	
	}

}
