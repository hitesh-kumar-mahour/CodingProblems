package codemonk;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class LittleMonkandBalancedParentheses {

	public static void main(String[] args) {
		
		Scanner s=new Scanner( System.in);
		int size=s.nextInt();
		int[]a=new int[size];
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		
		int n=fun(a);
		System.out.println(n);
		
	}

	private static int fun(int[] a) {

		Stack<Integer>st=new Stack<>();
		int maxLength=0;
		int tempLength=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{	
				st.push(a[i]);
				continue;
			}
			else
			{
				int temp;
				try{
					 temp=st.pop();
				}
				catch(EmptyStackException e)
				{
					continue;
				}
				if(-temp==a[i])
				{
					tempLength+=2;
				}
				else
				{
					st.clear();
					maxLength=Math.max(maxLength, tempLength);
					tempLength=0;
				}
//				if(st.isEmpty())
//				{
//					maxLength=Math.max(maxLength, tempLength);
//					tempLength=0;
//				}
			}
		}
		maxLength=Math.max(maxLength, tempLength);
		return maxLength;
	}
}
