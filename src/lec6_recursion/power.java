package lec6_recursion;

import java.util.Scanner;

public class power {
	
	public static int power(int x, int n)
	{
		if(n==1)
			return x;
		
		return x*power(x,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("input no. and power:");
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(power(x,n));

	}

}
