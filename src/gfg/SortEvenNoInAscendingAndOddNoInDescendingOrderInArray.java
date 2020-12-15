package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenNoInAscendingAndOddNoInDescendingOrderInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []a=new int[n];
		for (int i = 0; i < a.length; i++)
			a[i]=s.nextInt();
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		sortoddeven(a);
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		
	}

	private static void sortoddeven(int[] a) {
		
		int i=0,j=a.length-1;
		
		while(i<j)
		{
			while(a[i]%2!=0 && i<j)//odd 
				i++;
		
			if(i==j)
				break;
			
			while(a[j]%2==0 && i<j)//even
				j--;
		
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
		}

		
		System.out.println(i+" "+j);
		
		for (int p=0; p < a.length; p++)
			System.out.print(a[p]+" ");
		
System.out.println();
		
		Arrays.sort(a, 0,i);
		Arrays.sort(a,i,a.length);
		
		for(;i<(a.length-i)/2;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-1-i]
		}
		
	}
	
	
}
