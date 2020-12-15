package lec5_string_2Darray;

import java.util.Scanner;

public class largestSubstringNoRepetition {
	
//	http://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
	public static int larg_substring(String s)
	{
		int [] arr=new int[26];
		for(int i=0;i<arr.length;i++)
			arr[i]=-1;
		
		int length=1;
		String b=s.substring(0,1);
		
		arr[(int)s.charAt(0)-97]=0;
		
		for (int i = 0,j=1; j < s.length(); j++) 
		{
			if(arr[(int)s.charAt(j)-97]>=i)
			{
				i=arr[(int)s.charAt(j)-97]+1;
				arr[(int)s.charAt(j)-97]=j;
			}
			else
			{
				arr[(int)s.charAt(j)-97]=j;
				if(length<(j-i+1))
				{
					length=j-i+1;
					b=s.substring(i,j+1);
				}
				
			}
			
		}
	
		System.out.println(b);
		return length;
		
	}
	
	public static void main(String[] args) {
		
Scanner s= new Scanner(System.in);
System.out.print("enter string:");
   String  a= s.nextLine();
  // System.out.println(a);
   System.out.println(larg_substring(a));
	}
}

