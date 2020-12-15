package gfg;

import java.util.Scanner;
//http://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
public class MinMaxInRotatedSortedArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int size=s.nextInt();
			int []a=new int[size];
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
			
			System.out.println(max(a));
			System.out.println(min(a));
			t--;
		}
				
	}
	
	private static int max(int[] a) {
		
		if(a.length==1)
			return a[0];
		
		if(a[0]<a[a.length-1])//array is not rotated
			return a[a.length-1];
		
		int beg=0,end=a.length-1,mid;
		while(beg<=end)
		{
			 mid= (beg+end)/2;
			
			if(a[mid]>a[mid+1])
				return a[mid];
			if(a[mid]>a[end])
				beg=mid+1;
			else 
				end=mid-1;
		}
		
		return -1;
	}

	private static int min(int[] a) {
		
		
		if(a.length==1)
			return a[0];
		
		if(a[0]<a[a.length-1])//array is not rotated
			return a[0];
		if(a[0]>a[1])
			return a[1];
		
		int beg=0,end=a.length-1,mid;
		while(beg<=end)
		{
			 mid= (beg+end)/2;
			
			if(a[mid-1]>a[mid])
				return a[mid];
			if(a[mid]>a[end])
				beg=mid+1;
			else 
				end=mid-1;
		}
		
		return beg;
	}
}
