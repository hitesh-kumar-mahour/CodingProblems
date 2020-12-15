package assignment6recursion1;

import java.util.Scanner;

public class sumOfSeries {
	
	public static int pow(int n)
	{
		if(n==1)
			return 2;
		
		return 2*pow(n-1);
	}
	
	public static double series_sum(int k)
	{
		if(k==0)
			return 1;
	return 1.0/pow(k)+series_sum(k-1);
		
	}

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("for series 1+1/2+1/4+1/8+...+1/2^k\ninput k");
		int k=s.nextInt();
		System.out.println(series_sum(k));
	}

}
