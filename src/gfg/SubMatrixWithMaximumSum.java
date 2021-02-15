package gfg;
import java.util.*;

public class SubMatrixWithMaximumSum {

	static int start,finish;
	
    public static int kadane(int[] arr, int n){
       
        int sum = 0, maxSum = Integer.MIN_VALUE, i;
       
        finish = -1;
       
        int local_start = 0;
  
        for (i = 0; i < n; ++i)
        {
            sum += arr[i];
            if (sum < 0)
            {
                sum = 0;
                local_start = i + 1;
            }
          else if (sum > maxSum) 
          {
                maxSum = sum;
                start = local_start;
                finish = i;
            }
        }
         
        if (finish != -1)
            return maxSum;
       
        maxSum = arr[0];
        start = finish = 0;
       
        for (i = 1; i < n; i++)
        {
            if (arr[i] > maxSum)
            {
                maxSum = arr[i];
                start = finish = i;
            }
        }
        return maxSum;
  
    }
   
	
	
	public static ArrayList<ArrayList<Integer>> doit(ArrayList<ArrayList<Integer>> M) {
        
		int ROW = M.size(),COL = M.get(0).size();
		int maxSum = Integer.MIN_VALUE;
        int finalLeft = 0 , finalRight = 0, finalTop = 0, finalBottom = 0;
        int left, right, i;
        int []temp= new int[ROW];
        int sum;
       
        for (left = 0; left < COL; ++left)
        {
            Arrays.fill(temp, 0);

            for (right = left; right < COL; ++right)
            {
               
                for (i = 0; i < ROW; ++i)
                    temp[i] += M.get(i).get(right);
               
                sum = kadane(temp, ROW);
                 
                if (sum > maxSum)
                {
                    maxSum = sum;
                    finalLeft = left;
                    finalRight = right;
                    finalTop = start;
                    finalBottom = finish;
                }
            }
             
        }
        
        ArrayList<ArrayList<Integer>>a=new ArrayList<>();
        for(i=finalTop;i<=finalBottom;i++) {
        	ArrayList<Integer>t = new ArrayList<>();
        	for(int j=finalLeft;j<=finalRight;j++){
        		t.add(M.get(i).get(j));
        	}
        	a.add(t);
        }

        System.out.println(maxSum);
        for(ArrayList<Integer>x:a)
        	System.out.println(a.toString());
        
        return a;
	}
	
	public static void main(String[] args) {
//	     int[][] M ={{ 1, 2, -1, -4, -20 },
//                 { -8, -3, 4, 2, 1 },
//                 { 3, 8, 10, 1, 3 },
//                 { -4, -1, 1, 7, -6 }};
		ArrayList<ArrayList<Integer>>M = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>t=new ArrayList<Integer>();
		t.add(100);
		t.add(0);
		M.add(t);
		t=new ArrayList<Integer>();
		t.add(0);
		t.add(-100);
		M.add(t);
		
		doit(M);
	}
	
}
