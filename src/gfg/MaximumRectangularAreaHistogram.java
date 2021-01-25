package gfg;

import java.util.Stack;

//https://www.geeksforgeeks.org/largest-rectangle-under-histogram/


public class MaximumRectangularAreaHistogram {

	// Time = O(n), space = O(n)
    public static long getMaxArea(long a[])  {
        long ans=0;
        Stack<Integer>s=new Stack<>();
        
        for(int i=0;i<a.length;i++){
            
            while(!s.isEmpty() && a[i]<a[s.peek()]){
                int t = s.pop();
                
                long area_top;
                if(s.isEmpty())
                    area_top = a[t]*i;
                else
                    area_top = a[t]*(i-s.peek()-1);
                
                ans=Math.max(ans,area_top);
            }
            
            s.push(i);
        }
        
        while(!s.isEmpty()){
                int t = s.pop();
                
                long area_top;
                if(s.isEmpty())
                    area_top = a[t]*a.length;
                else
                    area_top = a[t]*(a.length-s.peek()-1);
                
                ans=Math.max(ans,area_top);
        }
    
    return ans;
    }
    
    
    

}
