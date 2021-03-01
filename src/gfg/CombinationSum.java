package gfg;

import java.util.*;

//https://www.geeksforgeeks.org/combinational-sum/
//https://leetcode.com/problems/combination-sum/submissions/
public class CombinationSum {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		for(int t=s.nextInt();t>0;t--){
		    int n = s.nextInt();
		    Set<Integer> set = new HashSet<>();
		    for(int i=0;i<n;i++)
		        set.add(s.nextInt());
		    int sum = s.nextInt();
		    
		    ArrayList<Integer> a = new ArrayList<>();
		    
		    for(Integer i:set)
		        a.add(i);
		    
		    Collections.sort(a);
		    if(!fun(0,0,new ArrayList<>(),sum,a))
		    	System.out.print("Empty");
		    
		    System.out.println();     
		    
		}
	}

	private static boolean fun(int i, int sum_so_far, ArrayList so_far, int sum, ArrayList<Integer> a) {
		
		if(sum_so_far>sum || i>=a.size())
			return false;
		
		if(sum_so_far == sum) {
			System.out.print(so_far);
			return true;
		}
		
		so_far.add(a.get(i));
		boolean flag1 = fun(i,sum_so_far+a.get(i),so_far,sum,a);
		
		so_far.remove(so_far.size()-1);
		
		boolean flag2 = fun(i+1,sum_so_far,so_far,sum,a);
	
		return flag1 || flag2;
	}

	
}
