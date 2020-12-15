package gfg;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;
//http://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/
public class BoundaryTraversalofBinaryTree {

	public static void main(String[] args) throws QueueEmptyException {
		
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		
		if(root==null)
		    return;
		    
		System.out.println(root.data);
		print_left(root.left);
		print_leaf(root);
		print_right(root.right);
	}
private static void print_right(BinaryTreeNode<Integer> root) {
		
	if(root==null)
		return;
	if(root.left==null&&root.right==null)
		return;
	
	if(root.right!=null)
		print_right(root.right);
	else print_right(root.left);
	
	System.out.println(root.data);
	
	}
private static void print_leaf(BinaryTreeNode<Integer> root) {
		
	if(root==null)
		return;
	if(root.left==null&&root.right==null)	
		System.out.println(root.data);
	
	else
		{
		print_leaf(root.left);
		print_leaf(root.right);
		}
		
	}
//	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	private static void print_left(BinaryTreeNode<Integer> root) {
		
		if(root==null)
			return;
		if(root.left==null&&root.right==null)
			return;
		
		System.out.println(root.data);
		
		if(root.left!=null)
			print_left(root.left);
		else print_left(root.right);
		
	}
}
