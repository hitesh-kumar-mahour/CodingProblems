package codemonk;

import java.util.Scanner;

public class GadgetFan {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int p=0;p<t;p++)
		{
		
			int n=s.nextInt();
			int k=s.nextInt();
			int count=0;
			
			int inc=0;
			for(int i=1;i<=k;i++)
			{
				if(i%2==0)
					inc++;
				count+=inc;
			}
			System.out.println(count);
			if(k>n+1)
			{
				int x=k-(n+1);
				x=x*(x+1)/2;
				count -=x;
			}
			
			System.out.println(count);
		}
		
		
		
	}
}
