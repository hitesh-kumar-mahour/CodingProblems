package gfg;

import java.util.Scanner;
//http://www.geeksforgeeks.org/type-array-maximum-element/
public class Typeofarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		print_type_and_max(a);
	}

	private static void print_type_and_max(int[] a) {
		
		int min_index=0;
		int max_index=0;
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]>a[max_index])
				max_index=i;
			else if(a[i]<a[min_index])
				min_index=i;
		}

		System.out.print(a[max_index]);
		
		if(min_index==0 && max_index==a.length-1)
			System.out.println(" 1");
		else if(min_index==a.length-1 && max_index==0)
			System.out.println(" 2");
		else if(min_index>max_index)
			System.out.println(" 4");
		
		else //(min_index<max_index)
			System.out.println(" 3");
	
	}
}
