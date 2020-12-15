package codezen;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(is_armstrong(n));
	}

	private static boolean is_armstrong(int n) {
		int length=0;
		int temp=n;
		while(temp!=0)
		{
			length++;
			temp/=10;
		}
		
		temp=n;
		int sum=0;
		
		while(temp!=0)
		{
			int a=temp%10;
			sum+=Math.pow(a,length);
			temp/=10;
		}
		
		return sum==n;
	}
}
