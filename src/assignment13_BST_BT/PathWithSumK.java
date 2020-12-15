package assignment13_BST_BT;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class PathWithSumK {
	public static boolean pathOfSum(BinaryTreeNode<Integer>root,int sum)
	{
		if(root==null)
			return false;
		
		sum-=root.data;
		
		if(sum==0&&root.left==null&&root.right==null)
		{
			System.out.println(root.data);
			return true;
		}
		
		if(sum<0)
			return false;
		
		if(pathOfSum(root.left, sum))
		{
			System.out.println(root.data);
			return true;
		}

		if(pathOfSum(root.right, sum))
		{
			System.out.println(root.data);
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
		pathOfSum(root, 8);
	}
}
