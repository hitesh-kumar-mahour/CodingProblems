package gfg;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPair {

	
	public static void MergeSort(int []input)
	{
		if(input.length<=1)
			return;

		int a[]=new int[input.length/2];
		for(int i=0;i<a.length;i++)
		{
			a[i]=input[i];
		}
		
		int b[]=new int[input.length-a.length];
		for(int i=0,j=a.length;i<b.length;i++,j++)
		{
			b[i]=input[j];
		}
		//printArray(a);
		//printArray(b);
		MergeSort(a);
		MergeSort(b);
		merge(a,b,input);
	}
	
	public static void merge(int[]a,int[]b,int[]c) {
		int i=0,j=0,k=0;
		//int c[]=new int[a.length+b.length];
		for(;i<a.length&&j<b.length;k++)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else if(a[i]==b[j])
			{
				c[k]=a[i];
				k++;
				c[k]=a[i];
				i++;
				j++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
		}
		
		for(;i<a.length;i++,k++)
		{
			c[k]=a[i];
		}
		for(;j<b.length;j++,k++)
			c[k]=b[j];
	}
	
	public static  int[]  takeInput(int size)
	{
		Scanner s = new Scanner(System.in);
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
//			System.out.println("Enter "+i+" element");
			input[i] = s.nextInt();
		}
		return input;
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int t=s.nextInt();
		ArrayList<String> answers=new ArrayList<>();
		
		for(int p=0;p<t;p++)
		{
			int size = s.nextInt();
			int val=s.nextInt();
			int [] a=takeInput(size);
			
			MergeSort(a);

			boolean ans=false;
			
			for(int i=0,j=a.length-1;i<=j;)
			{
				if(a[i]+a[j]==val)
				{
					ans=true;
					break;
				}
				if(a[i]+a[j]<val)
					i++;
				else j--;
				
			}
			
			if(ans)
			answers.add("Yes");
			else answers.add("No");
		
		}
		
		for (String ans:answers) {
			System.out.println(ans);
		}
		
	}
	
	
	
	
	
	
	
}
