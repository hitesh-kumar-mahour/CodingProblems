package assignment6recursion1;

import java.util.Scanner;

public class multiplyTwoNum {
	
	public static int product(int m ,int n)
	{
		if(n==1)
			return m;
		
		return(m+product(m, n-1));
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(product(a,b));
		
	}
	
}
