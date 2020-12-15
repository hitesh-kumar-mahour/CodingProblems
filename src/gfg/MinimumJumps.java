package gfg;

public class MinimumJumps {

//	https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps/0
//http://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/

    static int minJumps(int[] a){
        int []b=new int[a.length];
        fun(0,a,b);
         for(int i=0;i<b.length;i++)
             System.out.print(b[i]+" ");
         System.out.println();
         
        if(b[0]==Integer.MAX_VALUE || b[0]<0)
            return -1;
        return b[0];
    }

    public static void fun(int i,int []a,int []b){

        if(i>=a.length-1)
            return;

        if(b[i]!=0)
            return;
        
        if(a[i]==0){
            b[i]=Integer.MAX_VALUE;
            return;
        }
            
        if(i+a[i]>=a.length-1){
            b[i]=1;
            return;
        }
        
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=a[i];j++){
            fun(i+j,a,b);
            min=Math.min(min,b[i+j]);
        }
        
        b[i]=min+1;
    }
    
    public static void main(String[] args) {
    	int []a={2,3,1,1,2,4,2,0,1,1};
    	System.out.println("min jumpus = "+minJumps(a));
	}
}
