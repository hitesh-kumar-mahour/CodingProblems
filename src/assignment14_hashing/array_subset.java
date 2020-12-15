package assignment14_hashing;

import java.util.HashMap;

import lec3.array_use;

public class array_subset {

	public static void main(String[] args) {
		
		System.out.println("enter array ");
		int[]a1=array_use.input_array();
		System.out.println("enter subset array");
		int[]a2=array_use.input_array();
		
		System.out.println(subset(a1,a2));
	}

	public static boolean subset(int[] a1, int[] a2) {
		HashMap<Integer,Integer> map=new HashMap<>();
	
		for(int x:a1)
		{
				if(!map.containsKey(x))
					map.put(x, 1);
				else
				{
					int freq=map.get(x);
					if(freq>0)
						map.put(x, freq+1);
				}
		}
		
		for(int y:a2)
		{
			if(!map.containsKey(y))
				return false;
			
			int freq=map.get(y);
			if(freq==1)
				map.remove(y);
			else
				map.put(y, freq-1);
			
		}
//		System.out.println(map.size());
		return true;
	}
}
