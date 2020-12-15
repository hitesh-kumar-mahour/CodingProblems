package gfg;

public class LongestConsecutiveIncreasingBTree {
	
    public int longestConsecutive(TreeNode root){
        
        int ans = longestConsecutive(root, Integer.MAX_VALUE, 1);
        if(ans <= 1)
            return -1;
            
        return ans;
    }
    
	public int longestConsecutive(TreeNode root, int parent, int cons){
	    
            if(root == null)
                return cons;
            
            int left, right;
            
            if(parent+1==root.data){
                left = longestConsecutive(root.left, root.data, cons+1);
                right = longestConsecutive(root.right, root.data, cons+1);
            }
            else{
                left = longestConsecutive(root.left, root.data, 1);
                right = longestConsecutive(root.right, root.data, 1);
            }
            
            return Math.max(Math.max(left,right),cons);
        }
}
