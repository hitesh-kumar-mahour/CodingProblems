package assignment6recursion1;

import java.util.Scanner;

public class countZero {
	
	public static int count_zero(int n)
	{
		if(n/10==0)
			return 0;
		
		if(n%10==0)
			return 1+count_zero(n/10);
		
		return count_zero(n/10);
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter interger");
		int n=s.nextInt();
		System.out.println(count_zero(n));
	}

}
