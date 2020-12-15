package assignment10Stack_q;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;


public class DuplicateParenthesis {
//((a+b)+((c+d)))
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String a=s.nextLine();
		boolean ans=duplicateParenthesis(a);
		if(ans)
		System.out.println(1);
		else
			System.out.println(0);
		
		s.close();
	}

	public static boolean duplicateParenthesis(String s)
	{
		
	Stack<Character> st = new Stack<>();

	int i =0;

	int count = 0;

	while(i<s.length())

	{

	if(s.charAt(i)=='(')

	{

	st.add('(');

	i++;

	continue;

	}

	else if(s.charAt(i)==')')

	{

	count++;

	while(i+1<s.length()&&s.charAt(i+1)==')')

	{

	count++;

	i++;

	}

	while(count!=0)

	{

	char a =st.pop();

	if(a=='('&&count>=2&&st.peek()=='(')
	return true;

	else if(a=='(')
	count--;
	
	}

	}

	else{

	st.add(s.charAt(i));

	}

	i++;

	}

	return false;

	}
	public static boolean checkDupliPara(String a) {
        
		Stack<Character> st=new Stack<>();
		
        for(int i=0;i<a.length();i++)
		{
			 if(a.charAt(i)!=')')
			 {
				st.push(a.charAt(i)); 
			 }
			 else
			{
			try{
				 if(st.peek()=='(')
					 return true;
				 
				 while(st.peek()!='(')
				 st.pop();
			 
			 st.pop();
			 continue;
			}
			catch(EmptyStackException e){
			return false;
			}
			}
		}	
		 
		return false;
			 
 }

}
