package gfg;

public class CountNodesCompleteBinaryTree {

	
	// Time O(log(n)*log(n))
    public int leftDepth(TreeNode root){
        
        if(root==null)
            return 0;
        return leftDepth(root.left)+1;
    }
    
    public int rightDepth(TreeNode root){
        
        if(root==null)
            return 0;
        return rightDepth(root.right)+1;
    }
        
    public int countNodes(TreeNode root) {
        
        if(root==null)
                return 0;
        
        int l = leftDepth(root);
        int r = rightDepth(root);
        
        if(l==r)
            return (int)Math.pow(2,l)-1;
        
        return countNodes(root.left)+countNodes(root.right)+1;    
    }
}
