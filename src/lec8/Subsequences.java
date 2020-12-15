package lec8;

import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class Subsequences {
	public static String[] Subsequence(String a)
	{
		if(a.length()<=0)
		{
			String []Output={""};
		return Output;
		}
		String smallOutput[]=Subsequence(a.substring(1));
		String Output[]= new String[2*smallOutput.length];
		
		for(int i=0;i<smallOutput.length;i++)
		{
			Output[i]=smallOutput[i];
		}
		for(int i=0;i<smallOutput.length;i++)
		Output[smallOutput.length+i]=a.charAt(0)+smallOutput[i];
		
		return Output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s= new Scanner(System.in);
   System.out.println("enter string");
   String input=s.nextLine();
   String subsequence[]=Subsequence(input);
   for(int i=0;i<subsequence.length;i++)
	   System.out.println(subsequence[i]);
   
	}
}
