package assignment5array2D_string;

import java.util.Scanner;

public class reverseEachWordString {

	public static void reverse(String a)
	{
	for(int i=0;i<a.length();i++)
		{
		while(i<a.length()&&a.charAt(i)!=' ')
			i++;
		
				
		for(int j=i-1;j>=0&&a.charAt(j)!=' ';j--)
			System.out.print(a.charAt(j));
		
		System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter multi word string:");
		   String  a= s.nextLine();
		   reverse(a);
	}
}
