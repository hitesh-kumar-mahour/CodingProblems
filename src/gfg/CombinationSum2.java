package gfg;


import java.util.*;

public class CombinationSum2 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		for(int t=s.nextInt();t>0;t--){
		    int n = s.nextInt();
		    
		    ArrayList<Integer> a = new ArrayList<>();
		    for(int i=0;i<n;i++) 
		        a.add(s.nextInt());
		    
		    int sum=s.nextInt();
		    
		    Collections.sort(a);
		    ArrayList<ArrayList<Integer>> op = new ArrayList<>();
		    
		    fun(0,0,new ArrayList<>(),sum,a,op);
		    
		    for(ArrayList<Integer>curr : op) {
		    	System.out.print(curr.toString());
		    }
		    if(op.size()==0)
		    	System.out.print("Empty");
		    
		    System.out.println();
		    
		}

	}
	
	
	public static void fun(int i,int sum_so_far,ArrayList<Integer> so_far,int sum,ArrayList<Integer> a, ArrayList<ArrayList<Integer>> op) {
		
		if(sum_so_far==sum) {
			op.add(new ArrayList<Integer>(so_far));
			return;
		}
		
		if(sum_so_far>sum || i>=a.size())
			return;
		
		so_far.add(a.get(i));
		fun(i+1,sum_so_far+a.get(i),so_far,sum,a,op);
		
		so_far.remove(so_far.size()-1);
		for(;i<a.size()-1 && a.get(i)==a.get(i+1);i++); // 
		fun(i+1,sum_so_far,so_far,sum,a,op);
	}
}
