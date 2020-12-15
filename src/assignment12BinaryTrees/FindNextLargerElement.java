package assignment12BinaryTrees;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class FindNextLargerElement {

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root =BinaryTreeUse.InputBinaryTree();
		System.out.println("enter element");
		System.out.println(next_greater(root,12,Integer.MAX_VALUE));
	}
//5 6 7 8 10 -1 9 -1 -1 -1 -1 12 11 -1 -1 -1 -1
	private static int next_greater(BinaryTreeNode<Integer> root,int k,int next_greater) {
		
		if(root==null)
			return Integer.MAX_VALUE;
		
		
		int left=next_greater(root.left,k,next_greater);
		int right=next_greater(root.right,k,next_greater);
		
		if(root.data>k && root.data<next_greater)
				next_greater=root.data;
		
		return Math.min(next_greater, Math.min(left, right));
	}
}
