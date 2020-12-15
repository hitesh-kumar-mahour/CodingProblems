package gfg;

import java.util.Scanner;

//http://www.geeksforgeeks.org/mobile-numeric-keypad-problem/
public class MobileNumericKeypad {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
	  {		
		int n=s.nextInt();
		long[][] a=new long[10][n+1];
		long count=0;
		for(int i=0;i<10;i++)
		{
			count+=fun(n,i,a);
		}
		System.out.println(count);
		
		for(int i=0;i<10;i++)
		{
			for (int j = 0; j <=n; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	  }
	}

	private static long fun(int n, int i, long[][] a) {
	
		
		if(a[i][n]!=0)
			return a[i][n];
	
		if(n==0||n==1)
		{
			a[i][n]=n;	
			return	n;
		}
		
		long count=0;
		
		if(i==0)
		{
				count+=fun(n-1,i,a);
				count+=fun(n-1,8,a);
		}
		
		else if(i==1)
		{
				count+=fun(n-1,i,a);
				count+=fun(n-1,2,a);
				count+=fun(n-1,4,a);
		}

		else if(i==2)
		{
			count+=fun(n-1,i,a);	
			count+=fun(n-1,1,a);
				count+=fun(n-1,5,a);
				count+=fun(n-1,3,a);
		}
		else if(i==3)
		{
			count+=fun(n-1,i,a);
				count+=fun(n-1,2,a);
				count+=fun(n-1,6,a);
		}
		else if(i==4)
		{				count+=fun(n-1,i,a);
				count+=fun(n-1,1,a);
				count+=fun(n-1,7,a);
				count+=fun(n-1,5,a);
		}
		else if(i==5)
		{	
			count+=fun(n-1,i,a);
				count+=fun(n-1,2,a);
				count+=fun(n-1,4,a);
				count+=fun(n-1,6,a);
				count+=fun(n-1,8,a);
		}
		else if(i==6)
		{
			count+=fun(n-1,i,a);
				count+=fun(n-1,3,a);
				count+=fun(n-1,5,a);
				count+=fun(n-1,9,a);
		}
		else if(i==7)
		{
			count+=fun(n-1,i,a);
				count+=fun(n-1,4,a);
				count+=fun(n-1,8,a);
		}
		else if(i==8)
		{
			count+=fun(n-1,i,a);
				count+=fun(n-1,5,a);
				count+=fun(n-1,0,a);
				count+=fun(n-1,7,a);
				count+=fun(n-1,9,a);
		}
		else //i==9
		{
			count+=fun(n-1,i,a);
				count+=fun(n-1,6,a);
				count+=fun(n-1,8,a);
		}


		a[i][n]=count;
		
		return count;
	}
	
	
}
