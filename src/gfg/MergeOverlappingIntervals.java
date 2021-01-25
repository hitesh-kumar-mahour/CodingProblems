package gfg;

import java.util.*;

//https://www.geeksforgeeks.org/merging-intervals/

class Tpair{
	int first;
	int second;
	Tpair(int first, int second){	
		this.first = first;
		this.second = second;
	}
}


public class MergeOverlappingIntervals {

   public static ArrayList<Tpair> overlappedInterval(ArrayList<Tpair> a, int n){
	   
        Collections.sort(a,( x, y)->x.first-y.first); // lambda function
        
        ArrayList<Tpair> ans =new ArrayList<Tpair>();    
        
        ans.add(a.get(0));    
        
        for (int i = 1 ; i < a.size(); i++)  {
        	
            Tpair top = ans.get(ans.size()-1);  
    
            if (top.second < a.get(i).first)  
                ans.add(a.get(i));  
    
            else if (top.second < a.get(i).second)  
                top.second = a.get(i).second;  
        }  
    
        return ans;
   }
   
}
