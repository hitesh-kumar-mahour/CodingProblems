package lec8;

import java.util.Scanner;

public class keypad {

	public static  String[] jhvalpha(int n) {

		if(n==2)
		{
			String []output={"a","b","c"};
			return output;
		}
		if(n==3)
		{
			String []output={"d","e","f"};
			return output;
		}
		if(n==4)
		{
			String []output={"g","h","i"};
			return output;
		}
		if(n==5)
		{
			String []output={"j","k","l"};
			return output;
		}
		if(n==6)
		{
			String []output={"m","n","o"};
			return output;
		}
		if(n==7)
		{
			String []output={"p","q","r","s"};
			return output;
		}
		if(n==8)
		{
			String []output={"t","u","v"};
			return output;
		}
		if(n==9)
		{
			String []output={"w","x","y","z"};
			return output;
		}
		
		String output[]={""};
		return output;
	}

	public static String[] combination(int n)
	{
		if(n==0)
		{
			String []Output={""};
			return Output;
		}

		String [] smallOutput=combination(n/10);
		String a=alpha(n%10);
		String []Output=new String[a.length()*smallOutput.length];

		int k=0;
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<smallOutput.length;j++)
			{
				Output[k]=smallOutput[j]+a.charAt(i);
				k++;
			}
		}
		return Output;
	}

	private static String alpha(int n) {

		if(n==2)
			return "abc";
		if(n==3)		
			return "def";
		if(n==4)
			return "ghi";
		if(n==5)
			return "jkl";
		if(n==6)
			return "mno";
		if(n==7)
	    return "pqrs";
		if(n==8)
			return "tuv";
		if(n==9)
			return "wxyz";
		
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter no.");
		int n=s.nextInt();
		String[] a=combination(n);
		for(int i=0;i<a.length;i++)
			   System.out.println(i+" "+a[i]);
		   

	}
}