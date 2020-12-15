package codezen;

import java.util.Scanner;

public class energy {

	
	public static void pqr(int k,String a,String b)
	{
		if(a.length()>b.length())
		{
			String temp=a;
			a=b;
			b=temp;
		}
		
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					k--;
					if(k==0)
					{
						System.out.println("Yes");
						return ;
					}
					b=b.substring(0,j)+b.substring(j+1);
					break;
				}
			}
			
		}
		System.out.println("No");
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int k=s.nextInt();
		String a=s.next();
		String b=s.next();
		pqr(k,a,b);
		
	}
}
