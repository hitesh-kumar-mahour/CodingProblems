package gfg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

    public static int singleRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        return Integer.parseInt(str);
    }
    
	public static int fun(String[]a){
	    int i=0;
	    char c='\0';
	    
	    while(true){
	        int j;
	        for( j=0;j<a.length && i<a[j].length();j++){
	            if(c=='\0')
	               c=a[j].charAt(i);
	            else if(a[j].charAt(i)!=c)
	               return i;
	        }
	        if(j<a.length && i==a[j].length())
	            return i;
	        c='\0';
	        i++;
	    }
	}
	
    
	public static void main (String[] args) throws Exception {
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer =  new BufferedWriter(new OutputStreamWriter(System.out));
	    int T = singleRead(reader);
	    for(int t=0;t<T;t++) {
//	        int n = singleRead(reader);
	        String x = reader.readLine();
		    String[] a = x.split("\\s+");
		    writer.write(fun(a)+"\n");
		}
	    writer.close();
	}
}
