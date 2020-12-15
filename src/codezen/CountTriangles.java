package codezen;

import java.util.Scanner;

public class CountTriangles {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		int count=count_tri(a);
		System.out.println(count);
	}
	
	public static void selection_sort(int input[])
	{
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]>input[j]) /* for making decending use input[i]< input[j]  */
	            {
	               int k=input[i];
	                input[i]=input[j];
	                input[j]=k;
	            }
			}
		}
	}
	private static int count_tri(int[] a) {
		
		selection_sort(a);
		
		int count=0;
		for(int i=0;i<a.length-2;i++)
		{
			int k=i+2;
			for(int j=i+1;j<a.length-1;j++)
			{
				while(k<a.length&&a[i]+a[j]>a[k])
				{
					k++;
				}
				count+=k-j-1;
			}
		}
		return count;
	}
}
