package assignment13_BST_BT;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class LCA_BinaryTree {

	// we are assuming that both n1 and n2 are present in tree
	// time complexity is O(n)	
	public static int findLCA_BT(BinaryTreeNode<Integer>root,int a,int b){
		
		if(root==null)
			return 0;
		if(root.data==a||root.data==b)
			return root.data;
		
		int left=findLCA_BT(root.left, a, b);
		int right=findLCA_BT(root.right, a, b);
		
		if(left!=0&&right!=0)
			return root.data;
		if(left!=0)
			return left;
		if(right!=0)
			return right;
		
		return 0;
	}
//	refer https://www.youtube.com/watch?v=13m9ZCB8gjw
//	3 6 8 2 11 -1 13 -1 -1 9 5 7 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer>root =BinaryTreeUse.InputBinaryTree();
		System.out.println(findLCA_BT(root,8,7));
	}

}
