package gfg;

import java.io.*;
import java.util.*;

class Cmpa implements Comparator<Integer>{
    
    public int compare(Integer a,Integer b){
        
        String x=""+a+b, y=""+b+a;
    
        return - x.compareTo(y); 
    }
}

public class LargestNumberFromArray {
  
	public static int singleRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        return Integer.parseInt(str);
    }
    
    public static ArrayList<Integer> multiRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] x = str.split(" ");
        int N = x.length;
        ArrayList<Integer>arr = new ArrayList<>();
        for (int i=0;i<N;i++) {
            arr.add(Integer.parseInt(x[i]));
        }
        return arr;
    }
 
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer =  new BufferedWriter(new OutputStreamWriter(System.out));
	    int T = singleRead(reader);
	    for(int t=0;t<T;t++) {
	    	
	        int n = singleRead(reader);
	        ArrayList<Integer> a = multiRead(reader);
	        
	        writer.write(largestNumber(a)+"\n");
	    }
	    writer.close();
	 }
    public static String largestNumber(ArrayList<Integer> a) {
        
        Collections.sort(a,new Cmpa());
        
        StringBuffer ans=new StringBuffer();
        for(Integer x:a)
            ans.append(x);
        
        if(ans.charAt(0)=='0') // when ans is 0
        return "0";
        
        return ans.toString();
    }
    
	
}


