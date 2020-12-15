package gfg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//http://www.geeksforgeeks.org/find-next-greater-number-set-digits/
public class NextGreaterNumberSetDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			
			int n=s.nextInt();
		print_next_greater(n);
			t--;
		}
		
	}
// time complexity = O(n)index finding + O(n) smallest index finding + O(nlogn) for sorting = O(nlogn)
	
	private static void print_next_greater(int p) {
		
		String a=String.valueOf(p);
		int i,n=a.length();
		for(i=n-1;i>0;i--)// finding index i for which a[i-1]<a[i]
		{
			if(a.charAt(i-1)<a.charAt(i))
				break;
		}
		
		if(i==0)// number is largest
		{
			System.out.println("not possible");
			return ;
		}
		if(i==n-1) //number is smallest
			a=a.substring(0,i-1)+a.charAt(i)+a.charAt(i-1); 
		else
			{
				int smallest_index=i; // finding smallest number's index from i to n-1 which is greater than a[i-1] 
				
				for(int j=i+1;j<n;j++)
				{
					if(a.charAt(j)<a.charAt(smallest_index)&& a.charAt(j)>a.charAt(i-1))
						smallest_index=j;
				}
				
//				swapping a[smallest_index] with a[i-1]
				a=a.substring(0,i-1)+a.charAt(smallest_index)+a.substring(i,smallest_index)+a.charAt(i-1)+a.substring(smallest_index+1);
				
				int beg=i,end=n;// sort numbers from i to end
				char[] ar = a.substring(beg,end).toCharArray();
				Arrays.sort(ar);
				String sorted = String.valueOf(ar);

				a=a.substring(0,beg)+sorted;
			}
		 System.out.println(a);	
	}
}
