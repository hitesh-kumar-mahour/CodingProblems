package codemonk;

import java.util.Scanner;

public class SummationAintSimple {
	
	
	public static int alphacode(char c)
	{
		
		return (int)c-96;
	}
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	
	int t=s.nextInt();
	
		
		for(int p=0;p<t;p++)
		{
			
		String a=s.next();	
			int size=a.length(); 
			
			for(int i=0;i<size/2;i++)
			{
				int c1=alphacode(a.charAt(i));
				int c2=alphacode(a.charAt(a.length()-1-i));
				
				int sum=(c1+c2)%26;
				 
				if(sum==0)
					 sum=26;
				
				a=a.substring(0,i)+(char)(sum+96)+a.substring(i+1,a.length()-1-i)+(char)(sum+96)+a.substring(a.length()-i);
				
			}
			
			if(size%2!=0)
			{
				int i=size/2;
			 int c=alphacode(a.charAt(i));
			 
			 int sum=(2*c)%26;
			 
			 if(sum==0)
				 sum=26;
			 
			 a=a.substring(0,i)+(char)(sum+96)+a.substring(i+1);
			 
			 
			}
			
			
			System.out.println(a);
			
		 }
			
	}

}
