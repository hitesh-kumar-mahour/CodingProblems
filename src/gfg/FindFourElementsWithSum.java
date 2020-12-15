package gfg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//www.geeksforgeeks.org/find-four-elements-that-sum-to-a-given-value-set-2/

public class FindFourElementsWithSum {

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
	        int n = temp[0];
	        int sum = temp[1];
	        int[] a = multiRead(reader);
	        ArrayList<ArrayList<Integer>> ans = find4(a,sum);
	        
            writer.write(ans.toString());    
	        writer.newLine();
	    }
	    writer.close();
	 }

	//Time complexity O(n^3)
	private static ArrayList<ArrayList<Integer>> find4(int[] a, int sum) {
		
		HashSet<ArrayList<Integer>> set = new HashSet<>();
		
		Arrays.sort(a);
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		for(int i=0;i<a.length-2;i++) {
			for(int j=i+1;j<a.length-1;j++) {

				int p=j+1;
				int q=a.length-1;
				while(p<q) {
					if(a[p]+a[q]+a[i]+a[j]==sum) {
						ArrayList<Integer>l=new ArrayList<Integer>();
						l.add(a[i]);l.add(a[j]);l.add(a[p]);l.add(a[q]);
						if(!set.contains(l)) {
							ans.add(l);
							set.add(l);
						}
						p++;q--;
					}
					else if(a[p]+a[q]+a[i]+a[j]>sum) {
						q--;
					}
					else
						p++;
				}		
			}
		}
		
		return ans;
	}
}
