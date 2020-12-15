package gfg;

import java.util.Scanner;

public class SearchInRotatedArray {
		
	private static int find(int[] a, int k)
	{
		int index=-1;
		
		int  b=0,e=a.length-1;
		while(b<=e) {
			int m = (b+e)/2 ;
			if(a[m]==k) {
				index=m;
				e=m-1;
			}
			else if(a[0]<=a[m]) { 		// left half is sorted
				if(k<a[m]&&k>=a[0]) 	// k in left half
					e=m-1;
				else
					b=m+1;
			}
			else { 						// right half is sorted
				if(k>a[m]&&k<=a[e]) 	// k in right half
					b=m+1;
				else
					e=m-1;
			}
		}
		
		return index;
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		int t=s.nextInt();
		while(t>0)
		{
			int size=s.nextInt();
			int [] a=new int[size];
			
			for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
		
			int k=s.nextInt();
			System.out.println(find(a,k));
			
		 t--;
		}
	}
}
