package assignment8recursion3;

import java.util.Scanner;

public class keypad {
	
	

	public static String alphaString (int n)
	{
		String output="";
		
		if(n==2)
			 output="abc";
		else if(n==3)
			 output="def";
		else if(n==4)
			 output="ghi";
		else if(n==5)
			 output="jkl";
		else if(n==6)
			 output="mno";
		else if(n==7)
			 output="pqrs";
		else if(n==8)
			 output="tuv";
		else if(n==9)
			 output="wxyz";
				
		return output;
	}
	
	public static  String[] alpha2D(int n) {

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

	public static String[] return_combination(int n)
	{
		if(n==0)
		{
			String []Output={""};
			return Output;
		}

		String [] smallOutput=return_combination(n/10);
		String []a=alpha2D(n%10);
		String []Output=new String[a.length*smallOutput.length];

		int k=0;
		for(int i=0;i<smallOutput.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				Output[k]=smallOutput[i]+a[j];
				k++;
			}
		}
		return Output;
	}

	public static void print_combinations(int n,String decision_so_far)
	{
		if(n==0)
		{
			System.out.println(decision_so_far);
			return;
		}
		
		String a =alphaString(n%10);
		
		for(int i=0;i<a.length();i++)
		{
			print_combinations(n/10, a.charAt(i)+decision_so_far);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter no.");
		int n=s.nextInt();

		String[] a=return_combination(n);
		for(int i=0;i<a.length;i++)
			   System.out.println(i+" "+a[i]);
//		   print_combinations(n,"");

	}
}