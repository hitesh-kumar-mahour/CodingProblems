package prc;
import java.lang.reflect.Array;
import java.util.*;

public class Abc{

	
	public static void main(String[] args) {
		int[][] grid = {{0,2,2,1,1,0}};
		System.out.println(orangesRotting(grid));
	}
	
	public static boolean rot(int i, int j, int [][]grid, int[][] temp){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length)
            return false;
        if(grid[i][j]==0 || grid[i][j]==2)
            return false;
        
        temp[i][j]=2;
        return true;
    }
    
    public static int orangesRotting(int[][] grid){
        
        int count = 0;
        
        return orangesRotting(grid, count);
    }
    public static int orangesRotting(int[][] grid, int count)
    {
        boolean change = false;
        int [][] temp = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            	temp[i][j]=grid[i][j];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    if(rot(i+1,j,grid,temp))
                        change=true;
                    if(rot(i-1,j,grid,temp))
                        change=true;
                    if(rot(i,j+1,grid,temp))
                        change=true;
                    if(rot(i,j-1,grid,temp))
                        change=true;
                }
            }
        }
        
        boolean no_one = true;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(temp[i][j]==1)
                    no_one = false;
            }
        }
        
        if(!no_one && !change)
            return -1;
        
        
        if(no_one){
            if(change)
                return count+1;
            else
                return count;
        }
        
        return orangesRotting(temp,count+1);
    }
}