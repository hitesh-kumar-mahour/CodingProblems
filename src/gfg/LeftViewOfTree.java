package gfg;

import java.util.LinkedList;
import java.util.Queue;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class LeftViewOfTree {

	
	public static void printLeftView(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		
		Queue<BinaryTreeNode<Integer>> pending =new LinkedList<BinaryTreeNode<Integer>>();
		pending.add(root);
		
		while(!pending.isEmpty())
		{
			int count=pending.size();
			for(int i=1;i<=count;i++)
			{
			BinaryTreeNode<Integer> currNode=pending.remove();
				
				if(i==1)
					System.out.print(currNode.data+" ");
			
				if(currNode.left!=null)
					pending.add(currNode.left);
				
				if(currNode.right!=null)
					pending.add(currNode.right);
			}
		}
	}
//	1 2 3 4 5 -1 7 -1 -1 6 -1 -1 -1 -1 -1

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		printLeftView(root);
	}
}
