package gfg;

import java.io.*;
import java.util.*;

public class BufferIO
 {
    
    public static int singleRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        return Integer.parseInt(str);
    }
    
    public static int[] multiRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] x = str.split(" ");
        int N = x.length;
        int[] arr = new int[N];
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(x[i]);
        }
        return arr;
    }
 
	public static void main (String[] args) throws Exception{
		
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter writer =  new BufferedWriter(new OutputStreamWriter(System.out));
	    int T = singleRead(reader);
	    for(int t=0;t<T;t++) {
	    	
	        int n = singleRead(reader);
	        int[] a = multiRead(reader);
	        
	        for(int l=0;l<n;l++) {
	            writer.write(a[l] + " ");
	        }
	        
	        writer.newLine();
	    }
	    writer.close();
	}
}
