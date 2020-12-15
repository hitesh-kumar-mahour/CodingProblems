package gfg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int singleRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        return Integer.parseInt(str);
    }
    
    public static long[] multiRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] x = str.split(" ");
        int N = x.length;
        long[] arr = new long[N];
        for (int i=0;i<N;i++) {
            arr[i] = Long.parseLong(x[i]);
        }
        return arr;
    }

	private static long fun(long[] a,int m) {
		
		Arrays.sort(a);

		long min = 0;
		
		for(int i=0;i+m-1<a.length;i++) 
			min = Math.min(a[i+m-1]-a[i],min);
		
		return min;
	}
    
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer =  new BufferedWriter(new OutputStreamWriter(System.out));
	    int T = singleRead(reader);
	    for(int t=0;t<T;t++) {
	    	
	        int n = singleRead(reader);
	        long[] a = multiRead(reader);
	        int m = singleRead(reader);
	        
	        writer.write(fun(a,m)+"\n");
	    }
	    writer.close();
	 }
}
