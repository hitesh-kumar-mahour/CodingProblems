package lec18_bst;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class PrintNodesUnderRange {
	public static void printRange(BinaryTreeNode<Integer>root,int beg,int end)
	{
		if(root==null)
			return;
		if(root.data>=beg&&root.data<=end)
		{
			System.out.println(root.data);
			printRange(root.left, beg, end);
			printRange(root.right, beg, end);
		}
		else if(root.data>end)
			printRange(root.left, beg, end);
		else if(root.data<beg)
			printRange(root.right, beg, end);
		
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
		printRange(root,1,9);
	}

}
