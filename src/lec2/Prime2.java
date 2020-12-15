package lec2;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input no.");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		while(i<=n)
		{
			int j=2;
			while(j<i)
			{
				if(i%j==0)
				{
					break;
				}   
				j++;
			}
			if(j==i)
			System.out.println(i);
			
			i++;
		}
		
	}

}
