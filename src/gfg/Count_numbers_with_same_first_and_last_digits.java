package gfg;

import java.util.Scanner;

public class Count_numbers_with_same_first_and_last_digits {

//	http://www.geeksforgeeks.org/count-numbers-first-last-digits/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
			int beg=s.nextInt();
			int end=s.nextInt();
			
		System.out.println(equal(beg,end));	
			
			t--;
		}
	}

	private static int equal(int beg, int end) {
		
		int count=0;
		
		if(end<10)
			return 1+end-beg;
		
		if(beg<10)
		{
			count=count+10-beg;
			beg=10;
		}
		
		else
		{
			int i=beg;
			while( i/10 !=0)
			{
				i=i/10;
			}
			if(beg%10<=i)
				count++;
			beg=beg+(10-beg%10);
		}
		
		int  i=end;
		while( i/10 !=0)
		{
			i=i/10;
		}
		
		if(end%10>=i)
			count++;
		
		if(end%10!=0)
		{
			end=end-(end%10);
		}
		
		count=count+(end-beg)/10;
		
		
		return count;
	}
}
