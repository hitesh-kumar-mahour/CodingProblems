package gfg;

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair{
    char ch;
    int freq;
    Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

class cmp2 implements Comparator<Pair>{
    public int compare(Pair a, Pair b){
        if(a.freq < b.freq)
            return 1;
        return -1;
    }    
}

public class RearrangeCharacters {
    public static boolean fun(String a){
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++)
            {
                int freq = map.getOrDefault(a.charAt(i),0);
                map.put(a.charAt(i),freq+1);
            }
        
        PriorityQueue<Pair>pq=new PriorityQueue<>(new cmp2());
        
        for(char c : map.keySet())
            pq.add(new Pair(c,map.get(c)));
            
        
        Pair prev = new Pair('~',0); // initiating preq char
        StringBuffer result = new StringBuffer();
        
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            result.append(curr.ch);
            curr.freq -=1 ;
            
            if(prev.freq>0)
                pq.add(prev);
            
            prev = curr;
            
        }
        
        return result.length()==a.length();
        
    }
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		for (int t=s.nextInt();t>0;t--){
            boolean ans = fun(s.next());
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
		}
	}
}