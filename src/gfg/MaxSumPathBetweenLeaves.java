package gfg;



public class MaxSumPathBetweenLeaves {

    public static int ans;
    
    public static int maxPathSum(TreeNode root){ 
        ans = Integer.MIN_VALUE;
        fun(root);
        return ans;
    } 
    
    public static int fun(TreeNode root){
        
        if(root == null)
            return 0;
            
        if(root.left==null && root.right==null)
            return root.data;
    
        int l = fun(root.left);
        int r = fun(root.right);
            
        if(root.left == null)
            return r+root.data;
        
        if(root.right == null)
            return l+root.data;
        
        if(l+r+root.data>ans)
            ans = l+r+root.data;
        
        return Math.max(r,l)+root.data;

    }
}
