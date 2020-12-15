package gfg;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElementInArray {
//	http://www.geeksforgeeks.org/next-greater-element/
	
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(;t>0;t--)
		{
			int n=s.nextInt();
			int []a=new int[n];
			
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			
			int[] b=fun(a);
			
			for(int i:b)
			{	
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

	private static int[] fun(int[] a) {
		
		int []b=new int[a.length];
		Stack<Integer> s=new Stack<>();
		
		for(int i=a.length-1;i>=0;i--)
		{
			while(!s.isEmpty() && s.peek()<=a[i])
				s.pop();
			
			if(s.isEmpty()) 
				b[i]=-1;
			else
			{
				b[i]=s.peek();
			}
			
			s.push(a[i]);
		}
			
		return b;
	}
}
