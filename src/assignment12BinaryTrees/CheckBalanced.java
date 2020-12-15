package assignment12BinaryTrees;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

class BalRetType {

	int height;
	boolean isBal;
	public BalRetType(int height,boolean isBal)
	{
		this.height=height;
		this.isBal=isBal;
	}
}


public class CheckBalanced {

	    public static boolean isBalanced(BinaryTreeNode<Integer> root)
	    {
	       
		   BalRetType ans= IsBalanced(root);
	    
	         return ans.isBal;
	    }
	    
	   public static BalRetType IsBalanced(BinaryTreeNode<Integer> root)
	    {
	        if(root==null)
			{
				BalRetType ans=new BalRetType(0,true);
			return ans;
			}

			
			BalRetType left=IsBalanced(root.left);
			if(!left.isBal)
			{
				BalRetType ans=new BalRetType(-1, false);
				return ans;
			}
			
			BalRetType right=IsBalanced(root.right);
			if(!right.isBal)
				{
				BalRetType ans=new BalRetType(-1, false);
				return ans;
				}
			
			
			int height=Math.max(left.height,right.height)+1;
			boolean isBal=Math.abs(left.height-right.height)<=1;
			BalRetType ans=new BalRetType(height, isBal);
			
			return ans;
	    }
	    
	    public static void main(String[] args) throws QueueEmptyException {
			 BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
			 System.out.println(isBalanced(root));
		}


}
