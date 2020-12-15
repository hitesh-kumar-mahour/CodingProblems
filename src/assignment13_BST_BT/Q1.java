package assignment13_BST_BT;


import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class Q1 {
	
public static BinaryTreeNode<Integer>  deleteNodeinBST(BinaryTreeNode<Integer>root,int data) {
		
		if(root==null)
		return null;
		if(root.data==data)
		{
			
		}
		if(data<root.data)
		deleteNodeinBST(root.left, data);
		else
			deleteNodeinBST(root.right, data);
		
}
	public static void  insertNodeinBST(BinaryTreeNode<Integer>root,int data) {
		
		if(data<root.data)
		{
			if(root.left==null)
			{
				BinaryTreeNode<Integer>newNode=new BinaryTreeNode<Integer>(data);
				root.left=newNode;
				return;
			}
		insertNodeinBST(root.left, data);
		}
		else
		{	if(root.right==null)
			{
				BinaryTreeNode<Integer>newNode=new BinaryTreeNode<Integer>(data);
				root.right=newNode;
				return;
			}
			insertNodeinBST(root.right, data);
		}
		
	}
	public static boolean isEmpty(BinaryTreeNode<Integer>root)
	{
		return root==null;
	}
		
	public static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer>root,int val) {
			if(root==null)
				return null;
			if(root.data==val)
				return root;
			if(root.data>val)
				return findNode(root.left,val);
			else
				return findNode(root.right,val);
			
		}
		
	public static int  BTsize(BinaryTreeNode<Integer>root) {
		
		if(root==null)
		return 0;
		
		return 
		
	}
	
	public static void insertDuplicateAtLeft(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return;
		BinaryTreeNode<Integer>newNode=new BinaryTreeNode<Integer>(root.data);
		newNode.left=root.left;
		root.left=newNode;
		insertDuplicateAtLeft(root.left.left);
		insertDuplicateAtLeft(root.right);
		
	}

	//8 3 10 1 6 9 15 -1 -1 -1 -1 -1 -1 -1 -1

	public static void main(String[] args) throws QueueEmptyException {
		
		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
//		insertNodeinBST(root, 5);
		insertDuplicateAtLeft(root);
		BinaryTreeUse.printR(root);
	}

}
