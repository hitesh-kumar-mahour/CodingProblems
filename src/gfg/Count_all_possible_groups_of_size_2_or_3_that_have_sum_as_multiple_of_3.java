package gfg;

import java.util.Scanner;
//http://www.geeksforgeeks.org/count-possible-groups-size-2-3-sum-multiple-3/
public class Count_all_possible_groups_of_size_2_or_3_that_have_sum_as_multiple_of_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int [] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		int count=fun(a,new int[0]);
		System.out.println(count);
	}

	private static int fun(int[] a,int[] decision_so_far) 
	{
		
		
		if(decision_so_far.length==3)
		{
			int sum=0;
			for(int i=0;i<decision_so_far.length;i++)
				sum+=decision_so_far[i];
			
			if(sum%3==0)
				return 1;
			else
				return 0;
		}
		
		
		if(decision_so_far.length==2)
		{
			int sum=0;
			for(int i=0;i<decision_so_far.length;i++)
				sum+=decision_so_far[i];
		
			if(sum%3==0)
			{
				int count=1;
				for(int i=0;i<a.length;i++)
					if(a[i]%3==0)
						count++;
				
				return count;
			}
			
			if(a.length==0)
				return 0;
		}
		
		
		if((a.length+decision_so_far.length)<2)
			return 0;
		
		int[] new_a=new int[a.length-1];
		for(int i=0;i<new_a.length;i++)
			new_a[i]=a[i+1];
		
		int count1=fun(new_a, decision_so_far);
		
		int[] new_decision=new int[decision_so_far.length+1];
		
		for(int i=0;i<decision_so_far.length;i++)
			new_decision[i]=decision_so_far[i];
		
		new_decision[new_decision.length-1]=a[0];
		
		int count2=fun(new_a, new_decision);
		
		return count1+count2;
		
	}
}
