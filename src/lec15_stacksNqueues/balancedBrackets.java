package lec15_stacksNqueues;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
//	{a+[b+(c+d)]+(e+f)}
	public static boolean ifbalanced(String a)
	{
		Stack<Character>st=new Stack<>();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='{'||a.charAt(i)=='['||a.charAt(i)=='(')
			{
				st.push(a.charAt(i));
				continue;
			}
			try{//use try catch for handling stack empty exception
			 if(a.charAt(i)=='}'&&st.peek()=='{')
				st.pop();
			else if(a.charAt(i)==']'&&st.peek()=='[')
				st.pop();
			else if(a.charAt(i)==')'&&st.peek()=='(')
				st.pop();
			}
			catch(EmptyStackException e)
			{
				return false;
			}
			
		}
		if(st.size()==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		System.out.println("input string");
		String a=s.nextLine();
		boolean ans;
			ans = ifbalanced(a);
			System.out.println(ans);
	}

}
