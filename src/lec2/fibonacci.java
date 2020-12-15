package lec2;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input no.");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0,j=1,swap;
		while(i<=n)
		{
			System.out.println(i);
			swap=j;
			j=j+i;
			i=swap;
		}
		
	}

}
