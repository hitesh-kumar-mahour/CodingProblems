package lec18_bst;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class AllReturnPathProblems {

	public static boolean path(BinaryTreeNode<Integer>root,int val)
	{
		if(root==null)
			return false;
		if(root.data==val)
		{
			System.out.println(root.data);
			return true;
		}
		if(path(root.left, val))
		{
			System.out.println(root.data);
			return true;
		}
		if(path(root.right,val))
		{
			System.out.println(root.data);
			return true;
		}
		return false;
	}
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
//		path(root, 10);
	}
}
