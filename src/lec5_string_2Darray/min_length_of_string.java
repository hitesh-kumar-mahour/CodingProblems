package lec5_string_2Darray;

import java.util.Scanner;

public class min_length_of_string {
	
	public static int min_length(String a)
	{
		int i=0;
		int length1=0;
		for(;i<a.length()&&a.charAt(i)!=' ';i++)
		{
			length1++;
		}
		
		i++;
		for(;i<a.length();i++)
		{
			int length2=0;
			for(;i<a.length()&&a.charAt(i)!=' ';i++)
			{
				length2++;
			}
		if(length1>length2)
			length1=length2;
			
		}
		return length1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.print("enter multi word string:");
   String  a= s.nextLine();
   //System.out.println(a);
   int minLength=min_length(a);
   System.out.println(minLength);
	}

}
