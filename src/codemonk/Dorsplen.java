package codemonk;

import java.util.Scanner;

public class Dorsplen {

	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		long r=s.nextLong();
		long g=s.nextLong();
		long b=s.nextLong();
		long temp;
		if(r>g)
		{
			temp=r;
			r=g;
			g=temp;
		}
		if(r>b)
		{
			temp=r;
			r=b;
			b=temp;
		}
		if(g>b)
		{
			temp=g;
			g=b;
			b=temp;
		}
		
//		System.out.println(r);
//		System.out.println(g);
//		System.out.println(b);
//		bubble_sort(a);
		
		long count=r;
		
		r=0;
		g=g-count;
		b=b-count;
		
		if(g>=2)
		{
			long d=g/2;
			g-=2*d;
			count+=d;
			
		}
		
		if(g==1)
		{
			r--;g--;b--;
			count++;
		}
		

		if(b>=2)
		{
			long e=b/2;
			b-=2*e;
			count+=e;
			
		}
		
		if(b==1)
		{
			r--;g--;b--;
			count++;
		}
	System.out.println(count);	
	}
}
