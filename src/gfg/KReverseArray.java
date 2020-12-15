package gfg;


import java.util.*;
import java.lang.*;
import java.io.*;


public class KReverseArray {
    public static int min(int a, int b) {
        return a<=b?a:b;
    }
 
    public static int max(int a, int b) {
        return a>=b?a:b;
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
 
    public static void kReverse(int[] a,int k){
        
        for(int i=0;i<a.length;i+=k)
        {
            int p=i, q=Math.min(p+k-1,a.length-1);
            
            while(p<q){
                int c=a[p];
                a[p]=a[q];
                a[q]=c;
                p++;q--;
            }
        }
    }
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer =
                   new BufferedWriter(new OutputStreamWriter(System.out));
	    int T = singleRead(reader);
	    for(int t=0;t<T;t++) {
	        int[] temp = multiRead(reader);
	        int n = temp[0];
	        int k = temp[1];
	        int[] a = multiRead(reader);
	        
	        kReverse(a,k);
	        
	        for(int l=0;l<n;l++) {
	            writer.write(a[l] + " ");
	        }
	        
	        writer.newLine();
	    }
	    writer.flush();
	    writer.close();
	 }
}
