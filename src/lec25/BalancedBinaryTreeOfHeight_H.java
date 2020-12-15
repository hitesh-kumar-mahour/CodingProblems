package lec25;

import java.util.Scanner;

public class BalancedBinaryTreeOfHeight_H {

	public static double count(int height)
	{
		if(height==0||height==1)
			return 1;
		double a=count(height-1);
	
		double b=count(height-2);
		
		return (a*a)%(Math.pow(10,9)+7)+2*((a*b)%(Math.pow(10,9)+7));
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int k=s.nextInt();
		System.out.println(count(k));
	}
}
