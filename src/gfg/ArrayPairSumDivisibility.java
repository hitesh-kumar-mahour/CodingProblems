package gfg;

import java.util.HashMap;

public class ArrayPairSumDivisibility {

//	https://www.geeksforgeeks.org/check-if-an-array-can-be-divided-into-pairs-whose-sum-is-divisible-by-k/
//	https://www.youtube.com/watch?v=BvKv-118twg&ab_channel=Pepcoding
	
    public static boolean canPair(int []a, int k){
        
    	if(a.length%2!=0)
    		return false;
    	
    	HashMap<Integer,Integer>map=new HashMap<>();
    	
    	for (int i = 0; i < a.length; i++) {
			map.put( a[i]%k, map.getOrDefault(a[i]%k, 0)+1);	
		}
    	
    	if(map.containsKey(0)) {  // array contains numbers divisible by k
    		
    		if (map.get(0)%2!=0)
    			return false;
    		else
    			map.remove(0);
    	}
    	
    	for(int x:map.keySet()) {
    		
    		if(map.getOrDefault(k-x,-1)!=map.get(x))
    			return false;
    	}
    	
        return true;
    }
    
	public static void main(String[] args) {
		int [] a = {92, 75, 65, 48, 45, 35};
		System.out.println(canPair(a, 10));	
	}
	
}
