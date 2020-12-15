package assignment12BinaryTrees;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class AreStructurallyIdentical {

	public static boolean areIdentical(BinaryTreeNode<Integer>root1,BinaryTreeNode<Integer>root2)
	{
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null)
			return false;
		
		boolean ansL=areIdentical(root1.left, root2.left);
		if(ansL)
		{
			boolean ansR=areIdentical(root1.right, root2.right);
			return ansR;
		}
		return false;
	}
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer>root1=BinaryTreeUse.InputBinaryTree();
		BinaryTreeNode<Integer>root2=BinaryTreeUse.InputBinaryTree();
		System.out.println(areIdentical(root1, root2));
	}
}
