package assignment7recursion2;

import java.util.Scanner;

public class gcd {
	
	public static int gcd(int a,int b)
	{
		if(a%b==0)
			return b;
		
		return gcd(b, a%b);
	}

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter a and b: a>b ");
		int a=s.nextInt();
		int b=s.nextInt();
		int gcd=gcd(a,b);
		System.out.println(gcd);
		
			
			
		
	}

}
