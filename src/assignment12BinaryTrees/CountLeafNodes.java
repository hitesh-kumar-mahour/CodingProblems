package assignment12BinaryTrees;

import java.util.Scanner;

import lec13_LinkedList.Node;
import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.QueueUsingLL;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class CountLeafNodes {

	public static int count_leaf(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return 0;
		
		if(root.left==null&&root.right==null)
			return 1;
		
		return count_leaf(root.left)+count_leaf(root.right);
	}
	public static void main(String[] args) throws QueueEmptyException {

		BinaryTreeNode<Integer> root= BinaryTreeUse.InputBinaryTree();
		System.out.println(count_leaf(root));
	}

}
