package assignment5array2D_string;

import java.util.Scanner;

	public class ConsecutiveCharString {
		public static String encode(String a)
		{
			String b="";
	          for(int i=0;i<a.length();)
	          {
	              int j=i;
	              
	              while(j<a.length() && a.charAt(j)==a.charAt(i))
	                  j++;
	              
	              int count=j-i;
	              b=b+a.charAt(i)+count;
	             
	              i=j;
	          }
	          
	          return b;
		}
		public static void main(String[] args) {
				
				Scanner s= new Scanner(System.in);
				System.out.print("enter string:");
				String  a= s.nextLine();
			System.out.println(encode(a));
			
			}


}
