package lec11_oops;

import java.util.Scanner;

import assignment6recursion1.checkPalindrome;

public class SubstringsWhichArePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String a=s.nextLine();
		checkPalindrome c=new checkPalindrome();
		System.out.println(c.is_palindrome(a));
	}

}
