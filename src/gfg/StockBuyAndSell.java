package gfg;
import java.util.*;

public class StockBuyAndSell {
	
	public static void StockPrice(int[]a){
	    
	    ArrayList<Integer>st=new ArrayList<>();
	    
	    for(int i=0;i<a.length;i++){
	        
	        if(st.isEmpty())
	            st.add(i);
	        
	        else if(a[i]<a[st.get(st.size()-1)]){
	            if(st.size()%2!=0) 
	                st.remove(st.size()-1);
	            st.add(i);
	        }
	        
	        else if(a[i]==a[st.get(st.size()-1)]){
	            st.remove(st.size()-1);
	            st.add(i);
	        }
	        
	        else if(a[i]>a[st.get(st.size()-1)]){
	            if(st.size()%2==0)
	                st.remove(st.size()-1);
	            st.add(i);
	        }
    
	    }
	    
	    if(st.size()%2!=0)
	        st.remove(st.size()-1);
	    
	    if(st.isEmpty())
	        System.out.print("No Profit");
	    
	    for(int i=0;i<st.size();i+=2){
	        System.out.print("("+st.get(i)+" "+st.get(i+1)+") ");
	    }
	 
	    
	    System.out.println();
	    
	}
	
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
	    for(int t=s.nextInt();t>0;t--){
	    
	        int []a=new int[s.nextInt()];
	        for(int i=0;i<a.length;i++)
	            a[i]=s.nextInt();
	        
	        StockPrice(a);
	    }
	}
	
	
}