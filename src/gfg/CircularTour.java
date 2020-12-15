package gfg;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {

//	https://www.youtube.com/watch?v=zcnVaVJkLhY&ab_channel=TECHDOSE
	
//	Time=O(n) Space=O(1)
    public static int tour2(int petrol[], int distance[]){
        int n = petrol.length;
	    int index = -1;
	    
	    for(int i=0; i<n ;){
	    	int j=i;
	        int curr_petrol = petrol[j]-distance[j];
	        
	        for(j=(i+1)%n ; curr_petrol>=0 && j!=i ;j=(j+1)%n)
	            curr_petrol += petrol[j]-distance[j];
	        
	        if(curr_petrol>=0){
	            index = i;
	            break;
	        }
	        if(j>i)
                i=j;
            else
                i++;
	    }
	    
	    return index;
    }
	
    // O(n^2) Time, O(1) space
    public static int tour1(int petrol[], int distance[]){
        int n = petrol.length;
	    int index = -1;
	    
	    for(int i=0;i<n;i++){
	        int curr_petrol = petrol[i]-distance[i];
	        for(int j=(i+1)%n ; curr_petrol>=0 && j!=i ;j=(j+1)%n)
	            curr_petrol += petrol[j]-distance[j];
	        
	        if(curr_petrol>=0){
	            index = i;
	            break;
	        }
	    }
	    
	    return index;
    }
	
}

