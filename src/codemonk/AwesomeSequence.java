package codemonk;

import java.util.Scanner;

public class AwesomeSequence {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		
		int queriesize=s.nextInt();
		int[] query=new int[queriesize];
		int max=0;
		for(int i=0;i<queriesize;i++)
		{
			query[i]=s.nextInt();
			max=Math.max(max, query[i]);
		}
		System.out.println(max);
		int[] decision_so_far={1};
		int [] sequence=sq(a,decision_so_far,max);
	}

	private static int[] sq(int[] a, int[] decision_so_far, int max) {
		
		if(decision_so_far.length>max)
		return decision_so_far;
		
		int[] new_decision= new int[2*decision_so_far.length];
		
		int i;
		for( i=0;i<decision_so_far.length;i++)
			new_decision[i]=decision_so_far[i];
		
		int l=i;
		for(;i<new_decision.length;i++)
		{
			new_decision[i]=new_decision[i-l]+a[i%a.length];
		}
		
		return sq(a, new_decision, max); 
		
	}
}
