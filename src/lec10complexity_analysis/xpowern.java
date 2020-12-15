package lec10complexity_analysis;

import java.util.Scanner;

public class xpowern {

	public static int power(int x, int n)
	{
		if(n==1)
			return x;
		int ans=power(x,n/2);
		
		if(n%2==0)
		return ans*ans;
		
		else
			return  ans*ans*x;
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
