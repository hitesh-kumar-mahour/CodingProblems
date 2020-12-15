package gfg;

import java.util.Scanner;

public class Max_sum_without_Adjacents {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		int sum=max_sum(a,-1,new int[0]);
		System.out.println(sum);
	}

	private static int max_sum(int[] a, int beg, int[] decision) {
		
		if(beg>=a.length-1)
		{
			int sum=0;
			
			for(int i=0;i<decision.length;i++)
				sum+=decision[i];
			
			return sum;
		}
		int sum=0;
		for (int i = beg+1; i < a.length; i++) 
		{
			int [] new_decision=new int[decision.length+1];
			
			for(int j=0;j<decision.length;j++)
				new_decision[j]=decision[j];
			
			new_decision[new_decision.length-1]=a[i];
			
			sum=Math.max(sum, max_sum(a, i+1, new_decision));
		}
		
		return sum;
	}
}
