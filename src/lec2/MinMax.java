package lec2;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input n");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i;
		for(i=2;i<n;i++)
		{
		   if(n%i==0)
		   {  System.out.println(n+" not prime");
		      return;
		   }
		   i++;
		}
			System.out.println(n+" is prime");	
		
	}

}
