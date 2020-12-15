package codemonk;

import java.util.Scanner;

import assignment8recursion3.subsetofarray;

public class PowerOfTwo {
	
	
	public static boolean IsPowerOfTwo(int x)
	{
	    return (x != 0) && ((x & (x - 1)) == 0);
	}
	
	public static boolean subsetofarray(int[]a , int beg,int[]decisionSoFar)
	{
		if(beg>=a.length)
		{
			if(decisionSoFar.length==0)
				return false;
			
			int and_of_all=decisionSoFar[0];
			for(int i=1;i<decisionSoFar.length;i++)
				and_of_all &=decisionSoFar[i];
			
			return (IsPowerOfTwo(and_of_all));
		}
		
		boolean a1=subsetofarray(a, beg+1, decisionSoFar);
	
		 if(a1)
			 return true;
		
		int[] newdecision=new int[decisionSoFar.length+1];
		
		int i;
		for( i=0;i<decisionSoFar.length;i++)
			newdecision[i]=decisionSoFar[i];
		
		newdecision[i]=a[beg];
		
		boolean a2=subsetofarray(a, beg+1, newdecision);
		return a2;
	}
	
	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in); 
	int t=s.nextInt();
	String []ans=new String[t];
	for(int p=0;p<t;p++)
		{
			int size = s.nextInt();
			int input[] = new int[size];
			for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
			int[] empty={};
			
		if(subsetofarray(input,0,empty))
			ans[p]="YES";
		else ans[p]="NO";	
		}
	for(int p=0;p<t;p++)
		System.out.println(ans[p]);
	
	}
}
