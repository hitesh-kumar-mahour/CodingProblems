package gfg;

//https://www.interviewbit.com/problems/max-sum-path-in-binary-tree/

public class MaxSumPathBetweenAnyNodes {
    
	public static int ans;
    
    public static int maxPathSum(TreeNode root){ 
        ans = Integer.MIN_VALUE;
        fun(root);
        return ans;
    } 
    
    public static int fun(TreeNode root){
        
        if(root == null)
            return 0;
            
        if(root.left==null && root.right==null){
            if(root.data>ans)
                ans = root.data;
            return root.data;
        }
    
        int l = fun(root.left);
        int r = fun(root.right);
            
        if(root.left == null){
            int temp = Math.max(r+root.data,root.data);
            if(temp>ans) 
                ans = temp;
            return temp;
        }
        if(root.right == null){
            int temp = Math.max(l+root.data,root.data);
            if(temp>ans) 
                ans = temp;
            return temp;
        }
        if(l+r+root.data>ans)
            ans = l+r+root.data;
        
        int temp=Math.max(Math.max(l, r)+root.data,root.data);
        
        if(temp>ans)
        	ans=temp;        
        return temp;

    }
}
