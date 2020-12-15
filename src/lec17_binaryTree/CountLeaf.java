package lec17_binaryTree;

import lec15_stacksNqueues.QueueEmptyException;

public class CountLeaf {

	public static int countLeaf(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null)
			return 1;

		int leaf=countLeaf(root.left)+countLeaf(root.right);
		
		return leaf;
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		System.out.println(countLeaf(root));
	}
	
}
