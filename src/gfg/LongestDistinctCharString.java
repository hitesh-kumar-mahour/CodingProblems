package gfg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class LongestDistinctCharString {

    public static int singleRead(BufferedReader reader) throws Exception {
        String str = reader.readLine();
        str = str.trim();
        return Integer.parseInt(str);
    }
    
	public static void main(String[] args) throws Exception {
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter writer =  new BufferedWriter(new OutputStreamWriter(System.out));
	    int T = singleRead(reader);
	    for(int t=0;t<T;t++) {    	
	        String a = reader.readLine();
	        writer.write(fun(a)+"\n");
	    }
	    writer.close();
    }

	private static int fun(String a) {
		HashMap<Character, Integer> m =new HashMap<>();
		int max=0,beg=0;
		
		for (int i = 0; i < a.length(); i++) {
			
			if(m.containsKey(a.charAt(i)) && m.get(a.charAt(i))>=beg)
					beg=i;
			
			max=Math.max(max, i+1-beg);
			m.put(a.charAt(i), i);	
		}
		
		return max;
	}

}
