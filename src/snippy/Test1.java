package snippy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Test1 {

    public static int countStudents(ArrayList<Integer> height) {
        
    	int count = 0;
        ArrayList<Integer> a = new ArrayList<>(height);
        
        Collections.sort(a);
        for(int i=0;i<a.size();i++)
        {
        	if(a.get(i)!=height.get(i))
        		count++;
        }
        
        return count;
    }
    
    public static long kSub(int k, ArrayList<Integer> arr) {
    		   
    	        long temp[] = new long[k]; 
    	        Arrays.fill(temp, 0); 
    	  
    	        long cumSum = 0; 
    	        for (int i = 0; i < arr.size(); i++) { 
    	            cumSum += arr.get(i); 
    	  
    	            temp[(int) (((cumSum % k) + k) % k)]++; 
    	        } 
    	  
    	        long result = 0; 
    	  
    	        for (int i = 0; i < k; i++) 

    	            if (temp[i] > 1) 
    	                result += (temp[i] * (temp[i] - 1)) / 2; 

    	        result += temp[0]; 
    	  
    	        return result;   	   
    }
    
    public static long calculateTotalRegion(ArrayList<Integer> a) {
    	
    	long sum=0;

    	for (int i = 0; i < a.size(); i++) {
			int r=0,l=0;
    		for(int j=i+1;j<a.size()&&a.get(j)<=a.get(i);j++)
    			r++;
    		for(int j=i-1;j>=0&&a.get(j)<=a.get(i);j--)
    			l++;
    		sum+=l+r+1;
		}
    	
    	
	    return sum;
    }
    
    public long sumOfAllRegion(ArrayList<Integer> a){
    
    	long left = getNeightbourSum(a);
    	Collections.reverse(a);
		long right = getNeightbourSum(a);
	    
		return left + right + a.size();
    }
    
    public static long getNeightbourSum(ArrayList<Integer> a){
    	Stack<ArrayList<Integer>> s = new Stack<>();
    	long ans = 0;
    	for(int i=0;i<a.size();i++) {
    		int count = 0; 
    	   while(!s.isEmpty() && s.peek().get(0) <= a.get(i)) {
    		   count += s.peek().get(1) + 1;
    		   s.pop();
    	   }  
    	   ans += count ;
    	   ArrayList<Integer> t = new ArrayList<Integer>();
    	   t.add(a.get(i));
    	   t.add(count);
    	   s.add(t);
    	}
    	
    	return ans;
    }
    
}