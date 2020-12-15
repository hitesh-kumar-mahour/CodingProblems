package codeforces;

import java.util.Scanner;

public class MohammadandTriangle {

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
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int n=s.nextInt();int[]a=new int[n];
			
			for(int i=0;i<n;i++){
				a[i]=s.nextInt();
			}
			MergeSort(a);
		    for(int i=0;i<n-2;i++){
		        int k=i+2;
		        for(int j=i+1;j<n;++j){
		            while(k<n && a[i]+a[j]>a[k])
		                ++k;
		            if(k-j-1>0){
		                System.out.println("YES");
		                return ;
		            }
		            
		        }
		    }
		    System.out.println("NO");
			return ;

		}
}
