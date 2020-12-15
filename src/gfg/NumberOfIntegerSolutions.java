package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfIntegerSolutions {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
			int n=s.nextInt();
			char[]a=new char[n];
			for(int i=0;i<a.length;i++)
				a[i]=s.next().charAt(0);
			
			for(int i=0;i<a.length;i++)
				a[i]=s.next().charAt(0);
			
			Arrays.sort(a);
			
			for (int i = 0; i < a.length; i++)
				System.out.print(a[i]+" ");
			
			System.out.println();
			
			for (int i = 0; i < a.length; i++)
				System.out.print(a[i]+" ");
		
			System.out.println();
		}
		
		
	}
}
