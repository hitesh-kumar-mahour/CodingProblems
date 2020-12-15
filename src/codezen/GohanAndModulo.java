package codezen;

import java.util.Scanner;

public class GohanAndModulo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		int q=s.nextInt();
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<q;i++)
		{
			int type=s.nextInt();
			if(type==1)
			{
				int start=s.nextInt();
				int end=s.nextInt();
				int sum=0;
				for(int j=start-1;j<end;j++)
				{
					sum+=a[j];
				}
				System.out.println(sum);
			}
			else
			{
				int start=s.nextInt();
				int end=s.nextInt();
				int x=s.nextInt();
				for(int j=start-1;j<end;j++)
				{
					a[j]=a[j]%x;
				}
				
			}
		}
	}
}
