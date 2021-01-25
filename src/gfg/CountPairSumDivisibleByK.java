package gfg;

import java.util.*;

//[1,2,3,4,5] k

//[1,5,10,7,4,15]
//-1 + 10 -4 + 15


public class CountPairSumDivisibleByK {

	
	
	public static void main(String[] args) {
		int []a= {5,8,15,7,16,41,28};
		//5 7 8 15 16 41
		int k=23;
		int count = countPairDivisiblebyK(a,k);
		System.out.println(count);
	}

	private static int countPairDivisiblebyK(int[] a, int k) {
		double count =0;
		HashMap<Integer,Integer> m = new HashMap<>();
		for(int x:a)
			m.put(x%k, m.getOrDefault(x%k, 0)+1);
		
		if(m.containsKey(0)) {
			int t = m.get(0);
			t=t*(t-1)/2;
			count+=t;
		}

		if(k%2==0 && m.containsKey(k/2)) {
			int t = m.get(k/2);
			t=t*(t-1)/2;
			count+=t;
			m.remove(k/2);
		}
		
		for(int r:m.keySet()){
			if(m.containsKey(k-r)) {
				count += (m.get(r)*m.get(k-r))/2;
			}
		}
		
		return (int)count;
	}
	
}
