package gfg;
import java.util.*;

//https://practice.geeksforgeeks.org/problems/camelcase-pattern-matching/0#

class Cmp implements Comparator<String>{
	@Override
	public int compare(String a, String b) {
		
		String a_pattern=CamelCasePatternMatching.getPattern(a);
		String b_pattern=CamelCasePatternMatching.getPattern(b);
		
		if(a_pattern.compareTo(b_pattern)==0)
			return a.length()-b.length();
		
		return a_pattern.compareTo(b_pattern);
			
	}
}

public class CamelCasePatternMatching {

	public static String getPattern(String a) {
		String pattern="";
		for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='A' && a.charAt(i)<='Z')  
                pattern+=a.charAt(i);
        }
		return pattern;
	}
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		for(int t=s.nextInt();t>0;t--){
		    
		    ArrayList<String> a = new ArrayList<>();
		    HashMap<String,String> map = new HashMap<>();
            for(int n=s.nextInt();n>0;n--){
                String current_string = s.next();
                String current_pattern = getPattern(current_string);
                a.add(current_string);
                map.put(current_string,current_pattern);
            }
            
            String required_pattern = s.next();
            ArrayList<String> ans = new ArrayList<>();
            for(String x:a){
                if(map.get(x).startsWith(required_pattern))
                    ans.add(x);
            }
		    
		    if(ans.size()==0)
		        ans.add("No match found");
		    
		    Collections.sort(ans, new Cmp());
		    
		    for(String c:ans)
		        System.out.print(c+" ");
		        
		    System.out.println();
		}
	}
}
