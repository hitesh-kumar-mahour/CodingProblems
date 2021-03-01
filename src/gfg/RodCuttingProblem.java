package gfg;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/cutted-segments1642/1
public class RodCuttingProblem {

    public static int maximizeCuts(int n, int x, int y, int z){
        
       int [] a = {x,y,z};    
       int [][]t=new int[4][n+1];
       
       for(int i=1;i<=n;i++)t[0][i]=-1;
        
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                int curr = a[i-1];
                if(j<curr)
                    t[i][j]=t[i-1][j];
    	        else {
    	        	if(t[i-1][j]!=-1 && t[i][j-curr]!=-1)
    	        		t[i][j]=Math.max(t[i-1][j],t[i][j-curr]+1);
    	        	else if (t[i-1][j]==-1 && t[i][j-curr]==-1)
    	        		t[i][j]=-1;
    	        	else if(t[i-1][j]==-1)
    	        		t[i][j]=t[i][j-curr]+1;
    	        	else
    	        		t[i][j]=t[i-1][j];	
    	        }
            }
        }
        
        System.out.print("\t");
        for(int i=0;i<=n;i++)
        		System.out.print(i+"\t");
        System.out.println();
		System.out.println("____________________________________________________________________");
        for(int i=0;i<4;i++) {
        	System.out.print(i+"\t");
        	for(int j=0;j<=n;j++)
        		System.out.print(t[i][j]+"\t");
        	System.out.println();
        }
        return t[3][n];
    }
    public static void main(String[] args) {
		maximizeCuts(7,5,5,2);
	}
	
}
