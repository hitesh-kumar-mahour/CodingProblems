package lec2;

import java.util.Scanner;

public class prime {
	public static boolean isprime(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{
		   if(n%i==0)
		   { 
		      return false;
		   }
		   
		}
			return true;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input n");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		boolean ans=isprime(n);
		if(ans)
			System.out.println("prime");
		else
			System.out.println("not prime");
		
		
	}

}
