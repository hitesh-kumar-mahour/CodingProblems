package gfg;

import java.util.HashMap;


public class SmallestWindowContainingAllCharsOfPattern {

    public static String smallestWindow(String s, String p){
        
        String ans = null;
        
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<p.length();i++)
            mp.put(p.charAt(i),mp.getOrDefault(p.charAt(i),0)+1);
            
        HashMap<Character,Integer>ms=new HashMap<>();
        for(char c : mp.keySet())
            ms.put(c,0);
            
        int i=0,j=0,match_pat=mp.size(),match = 0;
        
        while(j<s.length()){
            
            //increment j
            while(j<s.length() && match<match_pat){
                if(ms.containsKey(s.charAt(j))){
                    ms.put(s.charAt(j),ms.get(s.charAt(j))+1);
                    if(ms.get(s.charAt(j)) == mp.get(s.charAt(j)))
                        match++;
                }
                j++;
            }
            
            if(match<match_pat && ans==null)
                return "-1";
            
            //increment i
            while(i<j && match==match_pat){
                 if(ms.containsKey(s.charAt(i))){
                    ms.put(s.charAt(i),ms.get(s.charAt(i))-1);
                    if(ms.get(s.charAt(i)) < mp.get(s.charAt(i)))
                        match--; 
                 }
                i++;
            }
            
            if(ans==null)
                ans=s.substring(i-1,j);
            else if(ans.length()>j+1-i)
                    ans=s.substring(i-1,j);
            
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(smallestWindow("ab", "a"));
	}
}
