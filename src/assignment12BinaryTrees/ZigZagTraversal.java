package assignment12BinaryTrees;

import java.util.Stack;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class ZigZagTraversal {
	
	public static void printZigZag(BinaryTreeNode<Integer>root)
	{
		Stack<BinaryTreeNode<Integer>> rightS=new Stack<>();
		Stack<BinaryTreeNode<Integer>> leftS=new Stack<>();
		int direc=1;
		rightS.push(root);
		while((!rightS.isEmpty()) || (!leftS.isEmpty()))
		{
			BinaryTreeNode<Integer> curr;
			if(direc==1)
			{
				curr=rightS.pop();
				System.out.print(curr.data+" ");
				
				if(curr.left!=null)
					leftS.push(curr.left);
				if(curr.right!=null)
					leftS.push(curr.right);
				
				if(rightS.isEmpty())
				{
					direc=0;
					System.out.println();
				}
			}
			else
			{
				curr=leftS.pop();
				System.out.print(curr.data+" ");
				
				if(curr.right!=null)
					rightS.push(curr.right);
				if(curr.left!=null)
					rightS.push(curr.left);

				if(leftS.isEmpty())
				{
					direc=1;
					System.out.println();
				}
				
			}
		
		}
	}
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		printZigZag(root);
	}
}
