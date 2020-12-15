package assignment8recursion3;

import java.util.Scanner;

public class Q9 {

	public static boolean IterativeCheck(String a) {
		
		if(a.charAt(0)!='a')
		return false;
		
		for(int i=0;i<a.length()-1;)
		{
			if(a.charAt(i)=='a')
			{
				if(a.charAt(i+1)=='a')
					i++;
				else
				{
					if(i+2>=a.length())
						return false;
					if(a.charAt(i+2)=='b')
						i+=2;
					else return false;
				}
			}
			else
			{
				if(a.charAt(i+1)=='a')
					i++;
				else return false;
					
			}
			
		}
		
		return true;

	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		String a=s.next();
		System.out.println(IterativeCheck(a));
		
	}
	
}
