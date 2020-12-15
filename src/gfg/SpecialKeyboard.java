package gfg;

import java.util.*;

public class SpecialKeyboard {
    
    public static int fun(int key_stroke, int max_key_strokes
                ,boolean selected,int copied, int so_far){
    
        if(key_stroke>max_key_strokes)
            return so_far;
        
        key_stroke++;
        
        int key1 = fun(key_stroke,max_key_strokes,false,copied,so_far+1);
        int key2 = fun(key_stroke,max_key_strokes,true,copied,so_far);
        int key3 = 0;
        if(selected)
            key3 = fun(key_stroke,max_key_strokes,false,so_far,so_far);
        int key4 = fun(key_stroke,max_key_strokes,false,copied,so_far+copied);
        
        return Math.max(Math.max(Math.max(key1,key2),key3),key4);
        
    }
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    for(int t=s.nextInt();t>0;t--){
	        int key_strokes = s.nextInt();
	        System.out.println(fun(1,key_strokes,false,0,0));
	    }
	}
}