package codemonk;

import java.util.Scanner;

public class ExploringRuins {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String a=s.next();
		
		if(a.charAt(0)=='?'){
		
			if(a.charAt(1)=='a')
			a='b'+a.substring(1);
			else{
				a='a'+a.substring(1);	
			}
				
		
		}
		for (int i=1; i < a.length(); i++) 
		{
			if(a.charAt(i)=='?')
			{
				if(a.charAt(i-1)=='a'||a.charAt(i+1)=='a')
				{
					a=a.substring(0,i)+'b'+a.substring(i+1);
				}
				else{
					a=a.substring(0,i)+'a'+a.substring(i+1);
				}
			}
			
		}
		
		System.out.println(a);
	}

	
	
	
}
