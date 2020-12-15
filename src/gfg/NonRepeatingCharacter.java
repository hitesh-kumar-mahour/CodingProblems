package gfg;

import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		while(t>0)
		{
		    String a=s.next();
		    fun(a);
		    t--;
		}
	}
	
	public static void fun(String a)
	{
	    int [] count=new int[26];
	    int n=a.length();
	    for(int i=0;i<n;i++)
	    {
	        count[(int)a.charAt(i)-97]++;
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	    	if(count[(int)a.charAt(i)-97]==1)
	    	{
	    		System.out.println(a.charAt(i));
	    		return;
	    	}
	    }
//	    for(int i=0;i<26;i++)
//	    	System.out.println((char)(i+97)+" "+count[i]);
	System.out.println(-1);
	}
}
