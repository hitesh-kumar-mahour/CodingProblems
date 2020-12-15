package assignment12BinaryTrees;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class BalancedFactor {
	
	public static boolean ifBalanced(BinaryTreeNode<Integer>root)
	{
		BalancedReturntype ans =BalancedFactor(root);
		int balFactor=ans.balFactor;
		if(balFactor<2&&balFactor>-2)
			return true;
		else return false;
	}

	public static BalancedReturntype BalancedFactor(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			BalancedReturntype ans=new BalancedReturntype(0, 0);
		return ans;
		}

		
		BalancedReturntype left=BalancedFactor(root.left);
		if(left.balFactor<2&&left.balFactor>-2)
		{
		BalancedReturntype right=BalancedFactor(root.right);
			if(right.balFactor<2&&right.balFactor>-2)
			{
				int height=Math.max(left.height,right.height)+1;
				int balFactor=left.height-right.height;
				BalancedReturntype ans=new BalancedReturntype(height, balFactor);
				return ans;
			}
			else 
			{
			BalancedReturntype ans=new BalancedReturntype(-1, 10);// indicating 10 for unbalancy
			return ans;
			}
		}
		else 
			{
			BalancedReturntype ans=new BalancedReturntype(-1, 10);// indicating 10 for unbalancy
			return ans;
			}
    }
		
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = BinaryTreeUse.InputBinaryTree();
//		BalancedReturntype ans = BalancedFactor(root);
//		System.out.println("height="+ans.height+"  Bfactor="+ans.balFactor);
System.out.println(ifBalanced(root));
	}
}
