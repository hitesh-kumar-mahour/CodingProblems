package gfg;


import java.util.*;

//https://www.geeksforgeeks.org/merging-intervals/

class pair{
	int first;
	int second;
	pair(int first, int second){	
		this.first = first;
		this.second = second;
	}
}

class cmp implements Comparator<pair>{
     public int compare(pair x,pair y){
        return x.first-y.first;
     }
} 

public class MergeOverlappingIntervals {

   public static ArrayList<pair> overlappedInterval(ArrayList<pair> a, int n){
	   
        Collections.sort(a,new cmp());
        
        ArrayList<pair> ans =new ArrayList<pair>();    
        
        ans.add(a.get(0));    
        
        for (int i = 1 ; i < a.size(); i++)  {
        	
            pair top = ans.get(ans.size()-1);  
    
            if (top.second < a.get(i).first)  
                ans.add(a.get(i));  
    
            else if (top.second < a.get(i).second)  
                top.second = a.get(i).second;  
        }  
    
        return ans;
   }
   
}
