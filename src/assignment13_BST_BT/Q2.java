package assignment13_BST_BT;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class Q2 {
	
	public static BinaryTreeNode<Integer> addDupli(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return null;
		if(root.left==null){
			root.left=new BinaryTreeNode<Integer>(root.data);
		}
		else{
			BinaryTreeNode<Integer>LeftTree=root.left;
			root.left=new BinaryTreeNode<Integer>(root.data);
			root.left.left=LeftTree;
			addDupli(root.left.left);
		}
		
		addDupli(root.right);
		
		return root;
	}

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
		root=addDupli(root);
		BinaryTreeUse.printIT(root);
		
	}
}
