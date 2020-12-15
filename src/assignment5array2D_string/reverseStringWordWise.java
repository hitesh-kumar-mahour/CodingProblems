package assignment5array2D_string;

import java.util.Scanner;

public class reverseStringWordWise {
// "welcome to coding ninjas" to "ninjas coding to welcome
	
	public static void reverse(String a)
	{
		int i;
		for( i=0;i<a.length()&&a.charAt(i)!=' ';i++)
		{
			;
		}
		if(i<a.length())
		reverse(a.substring(i+1));
		
		System.out.print(a.substring(0,i)+" ");
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter multi word string:");
		   String  a= s.nextLine();
		   reverse(a);
	}

public int braces(String a) {
	    
	    Stack<Character> s=new Stack<>();
	    for(int i=0;i<a.length();i++)
	    {
	        if(a.charAt(i)=='('||a.charAt(i)=='+'||a.charAt(i)=='-'||a.charAt(i)=='*'||a.charAt(i)=='\')
	            s.push(a.charAt(i));
	       else if(a.charAt(i)==')')
	       {
	           if(s.peek()=='(') return 0;
	           while(s.pop()!='(');
	       }
	       
	    }
	    return 1;
	}
}
