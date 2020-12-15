package gfg;

import java.util.Scanner;

public class Count_number_ofoccurrences_sorted_array {
//	http://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/


	private static int find_freq(int[] a, int n)
	{
		int beg=0,end=a.length-1;
		int first_index=-1;
		
		while(beg<=end)
		{
			int mid=(beg+end)/2;
			
			if(a[mid]==n)
			{
				first_index=mid;
				end=mid-1;
			}
			else if(a[mid]>n)
			{
				end=mid-1;
			}
			else
			{
				beg=mid+1;
			}
		}
		
		if(first_index==-1)
			return -1;
		
		beg=0;
		end=a.length-1;
		int last_index=-1;
		
		while(beg<=end)
		{
			int mid=(beg+end)/2;
			
			if(a[mid]==n)
			{
				last_index=mid;
				beg=mid+1;
			}
			else if(a[mid]>n)
			{
				end=mid-1;
			}
			else
			{
				beg=mid+1;
			}
		}
		
	 return last_index-first_index+1;	
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		int n=s.nextInt();
		
		int freq=find_freq(a,n);
		System.out.println(freq);
	}

}
