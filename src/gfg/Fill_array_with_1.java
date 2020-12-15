package gfg;

import java.util.Scanner;
//http://www.geeksforgeeks.org/fill-array-1s-minimum-iterations-filling-neighbors/
public class Fill_array_with_1 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int t=s.nextInt();
		 
		 while(t>0)
		 {
			 int size= s.nextInt();
			 int []a=new int[size];
			 for(int i=0;i<a.length;i++)
				 a[i]=s.nextInt();
			 
			 int count=count_iterations(a);
			 System.out.println(count);
			 
			 t--;
		 }
	}

	private static int count_iterations(int[] a) {
		
		int count1=0,count2=0,count3=0;
		// count1 for iteration for zeroes at begenning ex-> 000001........ here iterations will be same as number of zeroes 
		//count2 for iteration for zeroes at end ex-> .........100000	here iterations will be same as number of zeroes 
		//count3 for iteration for zeroes between 1s ex-> .....1000001...... here iterations will be (number of zeroes +1)/2
		
		int i=0;
		
		for(;i<a.length && a[i]!=1 ;i++) //for zeroes before first 1 
			count1++;
		
		if(i==a.length) // all elements are zero
			return -1;
		
		int beg=i; // 1st 1
		
		for(i=a.length-1;a[i]!=1;i--) //for zeroes after last 1
			count2++;
		
		int end=i; //last 1
		
		for(i=beg+1;i<end;i++)
		{
			int zeroes=0;
			
			while(a[i]==0)// for zeroes between 1s
			{
				zeroes++;
				i++;
			}
			
			count3=Math.max(count3, (zeroes+1)/2);
		}
		
		return Math.max(count1,Math.max(count2,count3));
		
	}
}
