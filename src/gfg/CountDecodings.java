package gfg;

public class CountDecodings {

	//Time O(n) Space O(n)
    public static int CountWays(String a){
        
        if(a.length()==0)
            return 1;
        
        //check for leading 0
        if(a.charAt(0)=='0')
            return 0;
        
        //check for repeating 00
        if(a.length()>2){
            for(int i=0;i<a.length()-1;i++)
                if(a.substring(i,i+2)=="00")
                    return 0;
        }
        
        int [] t = new int[a.length()+1];
        t[0]=1;
        t[1]=1;
        
        for(int i=2;i<=a.length();i++){
            
            int count=0;
            if(a.charAt(i-1)!='0')
                count=(count+t[i-1])%1000000007;
            if( a.charAt(i-2)=='1' || 
                (a.charAt(i-2)=='2' && a.charAt(i-1)<'7' ))
                count=(count+t[i-2])%1000000007;
            t[i]=count;                
        }

    return t[t.length-1];
        
}
}
