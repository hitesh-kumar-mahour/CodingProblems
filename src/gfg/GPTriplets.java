package gfg;

import java.util.*;


//https://www.geeksforgeeks.org/number-gp-geometric-progression-subsequences-size-3/

public class GPTriplets {
    
    public static long countTriplets(ArrayList<Long>arr,long r) {
    	long count=0;
    	HashMap<Long, Long> prev=new HashMap<Long, Long>();
    	HashMap<Long, Long> next=new HashMap<Long, Long>();
    	
    	for(long a:arr)
    		next.put(a,next.getOrDefault(a,0L)+1);
    	
    	for(int i=0;i<arr.size();i++) {
    		long cur = arr.get(i);
    		long l_count=0,r_count=0;
    		next.put(cur,next.getOrDefault(cur,0L)-1);
    		
    		if(cur%r==0 && prev.containsKey(cur/r))
    			l_count = prev.get(cur/r);

    		if(next.containsKey(cur*r))
    			r_count = next.get(cur*r);
    		
    		count+=(l_count*r_count);
    		prev.put(cur,prev.getOrDefault(cur, 0L)+1);
    	}
    	return count;
    }

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n = s.nextInt();
       long r = s.nextLong();
       ArrayList<Long> arr = new ArrayList<Long>();
       for (int i = 0; i < n; i++) 
			arr.add(s.nextLong());
       System.out.println(countTriplets(arr, r));

    }
    
}
