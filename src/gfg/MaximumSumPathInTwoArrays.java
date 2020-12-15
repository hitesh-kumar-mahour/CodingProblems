package gfg;

import java.util.Scanner;

public class MaximumSumPathInTwoArrays {
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
		int m=s.nextInt();
		int n=s.nextInt();
	
		int[] a=new int[m];
		for(int i=0;i<m;i++)
			a[i]=s.nextInt();
		

		int[] b=new int[n];
		for(int i=0;i<n;i++)
			b[i]=s.nextInt();
		
		System.out.println(fun(a,b));
		
		t--;
		}
	}

	private static int fun(int[] a, int[] b) {
		
		int max_sum=0;
		int sum1=a[0];
		int sum2=b[0];
		
		int i=0,j=0; 
		while(true)
		{
			if(a[i]==b[j])
			{
				max_sum+=Math.max(sum1,sum2);
				i++;j++;
				if(i>=a.length || j>=b.length)
					{
					    sum1=0;sum2=0;
						break;
					}
				
				sum1=a[i];sum2=b[j];
			}
			else if(a[i]<b[j])
			{
				i++;
				if(i>=a.length) 
				{
					j++;
					break;
				}
				
				sum1+=a[i];
			}
			else
			{
				j++;
				if(j>=b.length) 
				{
					i++;
					break;
				}
				
				sum2+=b[j];
			}
		}
		
		while(i<a.length)
		{
			sum1+=a[i];
			i++;
		}
		while(j<b.length)
		{
			sum2+=b[j];
			j++;
		}
		
		max_sum+=Math.max(sum1,sum2);
		return max_sum;
	}
}
