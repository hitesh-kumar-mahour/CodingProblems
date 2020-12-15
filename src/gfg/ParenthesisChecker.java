package gfg;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String a=s.next();
		
		System.out.println(check(a));
	}

	private static boolean check(String a) {
		Stack<Character> st=new Stack<Character>();
		
		for (int i = 0; i < a.length(); i++)
		{
			if(a.charAt(i)=='['||a.charAt(i)=='{'||a.charAt(i)=='(')
				st.push(a.charAt(i));
			else if(a.charAt(i)==']'&&(st.isEmpty()||st.pop()!='['))
				return false;
			else if(a.charAt(i)=='}'&& (st.isEmpty()||st.pop()!='{'))
				return false;
			else if(a.charAt(i)==')'&& (st.isEmpty()||st.pop()!='('))
				return false;
			else continue;
		}

		return st.isEmpty();
		
	}
}
