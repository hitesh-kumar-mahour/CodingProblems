package assignment6recursion1;

import java.util.Scanner;

public class sumOfDigits {

	public static int sum_digits(int n)
	{
		if(n/10==0)
			return n%10;
		
		return n%10+sum_digits(n/10);
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter interger");
		int n=s.nextInt();
		System.out.println("sum of digits in "+n+" is "+sum_digits(n));
	}
}
