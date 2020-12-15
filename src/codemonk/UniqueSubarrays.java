package codemonk;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueSubarrays {
	public static void print_array(int []input)
	{
		for(int i=0;i< input.length ;i++)
		{
			System.out.print(input[i]+" ");
		}
			
	}
	
	
	public static int uniqSum(int []a)
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			HashMap<Integer, Integer> subset_map=new HashMap<>();

				subset_map.put(a[i],1);
				sum+=1;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(subset_map.containsKey(a[j]))
					break;
				
				subset_map.put(a[j],1);
				sum+=j-i+1;
			}
		
		}
		
		return sum;
	}
	
public static void main(String args[] ) throws Exception {
  
	        Scanner s = new Scanner(System.in);
	        System.out.println("test cases:");
	        int t = s.nextInt();
			for(int p=0;p<t;p++)
	       { 
				System.out.println("enter size");
	       		int size= s.nextInt();
				int input[]=new int[size];
				for(int i=0;i<size;i++)
				{
					input[i]=s.nextInt();
					
				}
				int sum=uniqSum(input);
				
	       		System.out.println(sum);
	    
	       }
  
   }
}
