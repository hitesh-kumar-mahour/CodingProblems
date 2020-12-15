package codemonk;

import java.util.Scanner;

public class BinaryQueries {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
//		System.out.println("enter size and test cases");
		int size=s.nextInt();
		int t=s.nextInt();
		
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<t;i++)
		{
			int q=s.nextInt();
			if(q==1)
			{
				int index=s.nextInt();
	
					a[index-1]=1^a[index-1];
			}
		
			else{
				
				int begIndex=s.nextInt();
				int endIndex=s.nextInt();
				
				if(a[endIndex-1]==1)
					System.out.println("ODD");
				else
					System.out.println("EVEN");
					
			}
		}
		
		
		
		
		
//		for(int i=0;i<size;i++)
//		{
//			System.out.print(a[i]);
//		}
	}

}
