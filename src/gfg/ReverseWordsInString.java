package gfg;

import java.util.Scanner;

public class ReverseWordsInString {

	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		s.nextLine();
		while(t>0)
		{
		    String a=s.nextLine();
		    System.out.println(fun(a));
		    t--;
		}
	}
	
	public static String fun(String a)
	{
	    int i=0;
	    while(i<a.length()&&a.charAt(i)!=' ')
	    i++;
	    
	    if(i>=a.length())
	        return a;
	        
	    return fun(a.substring(i+1))+" "+a.substring(0,i);
	}
}
