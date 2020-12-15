package codemonk;

import java.util.Scanner;

public class DhananjaysMagicalword {

	public static boolean isalphaprime(int n)
	{
		int arr[]={67,71,73,79,83,89,97,101,103,107,109,113};
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
				return true;
		}
	return false;  //qOOOgCCaCSgImCSaaOI
	}
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String a=s.next();
		
		for(int i=0;i<a.length();i++)
		{
		
			int p=(int)a.charAt(i);
		
			if(p<=67)
				p=67;
			
			else if(p>=113)
				p=113;
			
			else
			{
				for(int j=0;;j++)
				{
					if(isalphaprime(p-j))
					{
						p=p-j;
						break;
					}
					
					if(isalphaprime(p+j))
					{
						p=p+j;
						break;
					}
			
				}
			}
			
			a=a.substring(0,i)+(char)p+a.substring(i+1);
		}
	
		System.out.println(a);
	}
}
