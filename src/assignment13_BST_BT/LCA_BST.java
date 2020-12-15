package assignment13_BST_BT;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class LCA_BST {

//	time complexity O(height)
	public static int findLCA_BST( BinaryTreeNode<Integer>root,int n1,int n2)
	{
		if(root==null)
			return -1;
		
		if(n1<root.data&&n2<root.data)//n1 and n2 are on left side
			return findLCA_BST(root.left, n1, n2);
		
		if(n1>root.data&&n2>root.data)//n1 and n2 are on right side
			return findLCA_BST(root.right, n1, n2);
		
		else 	//if(root.data==n1||root.data==n2) or (n1 and n2 are on different sides)
			return root.data;  
	}
	//10 8 14 6 9 12 15 2 7 -1 -1 11 13 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	// here we are asumming that both nodes should be present in the tree

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer>root =BinaryTreeUse.InputBinaryTree();
		System.out.println(findLCA_BST(root,9,2));
	}
	
}
