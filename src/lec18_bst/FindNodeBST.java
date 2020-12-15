package lec18_bst;

import java.util.Scanner;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class FindNodeBST {
	
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
	//8 3 10 1 6 9 15 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) throws QueueEmptyException {
		Scanner s=new Scanner(System.in);
		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
		int val=s.nextInt();
		BinaryTreeNode<Integer>Node=findNode(root,val);
		System.out.println(Node+" "+Node.data);
		s.close();
	}
}
