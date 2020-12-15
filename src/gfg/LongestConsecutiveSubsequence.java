package gfg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveSubsequence {

	//time O(n), space=O(n)
private static int lcs(int[] a) {
	
	Arrays.sort(a);
	
	HashMap<Integer,Integer> map = new HashMap<>();
	
	int max=1;
	
	for(int i=0;i<a.length;i++)
		    map.put(a[i],1);
	
	for(int i=0;i<a.length;i++) {
		if(map.containsKey(a[i]-1))
		    map.put(a[i],map.get(a[i]-1)+1);
		max =  Math.max(map.get(a[i]),max);  
	}
		
	return max;
}

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
    	
        int n = singleRead(reader);
        int[] a = multiRead(reader);
        
        writer.write(lcs(a)+"\n");

    }
    writer.close();
 }    

}
