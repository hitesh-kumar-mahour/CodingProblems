package gfg;

import java.util.Scanner;

public class FirstAndLastIndexOfNumberInSortedArray {

	private static void find_fandl(int[] a, int n)
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
			{
			    System.out.println("-1");
			    return;
			}
		
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
		
	 	System.out.println(first_index+" "+last_index);
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	    int t=s.nextInt();
    	while(t>0)
    	{
    	    int size=s.nextInt();
    		int[] a=new int[size];
    		
    		for (int i = 0; i < a.length; i++) {
    			a[i]=s.nextInt();
    		}
    		
    		int n=s.nextInt();
    		
    		find_fandl(a,n);
    	
    	    t--;
    	}
	    
	}
}
