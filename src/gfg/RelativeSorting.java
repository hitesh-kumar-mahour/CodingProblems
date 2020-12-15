package gfg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/relative-sorting/0

public class RelativeSorting {

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
 
	public static void main (String[] args) throws Exception
	 {
		
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer =  new BufferedWriter(new OutputStreamWriter(System.out));
	    int T = singleRead(reader);
	    for(int t=0;t<T;t++) {
	    	
	    	int[] temp = multiRead(reader);
	    	int n = temp[0], m = temp[1];
	        
	    	int[] a = multiRead(reader);
	    	int[] b = multiRead(reader);
	        
	    	relativeSort(a,b);
	    	
	        for(int l=0;l<n;l++) {
	            writer.write(a[l] + " ");
	        }
	        
	        writer.newLine();
	    }
	    writer.close();
	 }

	private static void relativeSort(int[] a, int[] b) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		
		int j=0;
		
		for(int i=0;i<b.length;i++) {
			if(map.containsKey(b[i])) {
				for(int n = map.get(b[i]); n>0 ; n--,j++)
					a[j]=b[i];
				map.remove(b[i]);
			}
		}
		int k=j;
		
		for(int x : map.keySet()) {
			for(int n = map.get(x); n>0 ; n--,j++)
				a[j]=x;
		}
		
		Arrays.sort(a,k,a.length);
	}
}
