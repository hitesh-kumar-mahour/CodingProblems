package gfg;

import java.util.*;

public class GroupAnagramsTogether {
	
//	https://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together/
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(;t>0;t--)
		{
			int n=s.nextInt();
			String[]a=new String[n];
			for (int i=0; i<n ; i++) 
				a[i]=s.next();
			
			fun(a);
			System.out.println();
		}
		
	}
	
	//Time O(nm) Space O(n+m)
	public static void fun(String []a){
	    
	    HashMap<HashMap<Character,Integer>,ArrayList<String>> m = new HashMap<>(); 
	    
	    for(int i=0;i<a.length;i++){
	        HashMap<Character,Integer> f = new HashMap<>();
	        for(int j=0;j<a[i].length();j++)
	            f.put(a[i].charAt(j),f.getOrDefault(a[i].charAt(j),0)+1);
	         
	        ArrayList<String> temp = m.getOrDefault(f,new ArrayList<String>());
	        temp.add(a[i]);
	        m.put(f,temp);   
	    }
	        
        ArrayList<Integer> ans = new ArrayList<>();
	        
        for(HashMap<Character,Integer> f:m.keySet())
        		ans.add(m.get(f).size());
	                
       Collections.sort(ans);
	       
       for(int x : ans)
    	   System.out.print(x+" ");
	        
    }

}
