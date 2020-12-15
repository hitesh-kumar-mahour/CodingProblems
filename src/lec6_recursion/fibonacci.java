package lec6_recursion;

import java.util.Scanner;

public class fibonacci {

	public static int fib(int n){
		if(n == 0 || n == 1){
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter element");
		int n=s.nextInt();
System.out.println(fib(n));
	}

}
