package gfg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class PythagoreanTriplet {
	
		    
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

		private static boolean containsPythagoreanTriplet(int[] a) {

			if(a.length<3) return false;
			
			Arrays.sort(a);
			
			int count=0;
			for (int i = a.length-1; i >= 2; i--) {
				
				for(int l=0,r=i-1;l<r;) {
					
					if(a[l]*a[l] + a[r]*a[r] == a[i]*a[i]){
						count++;
						l++;
						r--;
					}
						
					else if(a[l]*a[l] + a[r]*a[r] < a[i]*a[i])
						l++;
					else r--;
				}
			
			}
			return count>0;
		}
	    
		public static void main (String[] args) throws Exception
		 {
		    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter writer =  new BufferedWriter(new OutputStreamWriter(System.out));
		    int T = singleRead(reader);
		    for(int t=0;t<T;t++) {
		    	
		        int n = singleRead(reader);
		        int[] a = multiRead(reader);
		        
		        writer.write(containsPythagoreanTriplet(a)+"\n");
		    }
		    writer.close();
		 }

}
