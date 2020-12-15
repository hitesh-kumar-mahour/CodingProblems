package gfg;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class LCABinaryTree {

public static void main(String[] args) throws QueueEmptyException {
		
		BinaryTreeNode<Integer> root =BinaryTreeUse.InputBinaryTree();
		System.out.println(findLCA(root,4,6));
	}	

// we are assuming that both n1 and n2 are present in tree
// time complexity is O(n)
	private static int findLCA(BinaryTreeNode<Integer> root, int n1, int n2) {
	
		if(root==null)
			return -1;
		
		if(root.data==n1)
			return n1;
		if(root.data==n2)
			return n2;
		
		int left=findLCA(root.left, n1, n2);
		int right=findLCA(root.right, n1, n2);
		
		if(left!=-1 && right!=-1)
			return root.data;
		if(left==-1)
			return right;
		if(right==-1)
			return left;
		
		return -1;
	}
}
