package assignment12BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class LevelOrderTraversal {

	public static void printLevelWise(BinaryTreeNode<Integer>root)
	{
		Queue<BinaryTreeNode<Integer>> pending=new LinkedList<BinaryTreeNode<Integer>>();
		pending.add(root);
		pending.add(null);
		while(!pending.isEmpty())
		{
			BinaryTreeNode<Integer> currNode=pending.remove();
			
			if(pending.isEmpty())
				  return;
			
			if(currNode==null)
			{
				System.out.println();
				pending.add(null);
				
			}
			else
			{
				
				System.out.print(currNode.data+" ");
			
				if(currNode.left!=null)
					pending.add(currNode.left);
				if(currNode.right!=null)
					pending.add(currNode.right);
			}
		}
	}
	public static void printLevelWise2(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		
		Queue<BinaryTreeNode<Integer>> pending =new LinkedList<BinaryTreeNode<Integer>>();
		pending.add(root);
		
		while(!pending.isEmpty())
		{
			int count=pending.size();
			while(count>0)
			{
			BinaryTreeNode<Integer> currNode=pending.remove();
			
				System.out.print(currNode.data+" ");
			
				if(currNode.left!=null)
					pending.add(currNode.left);
				if(currNode.right!=null)
					pending.add(currNode.right);
			count--;
			}
			System.out.println();
		}
	}
//	1 2 3 4 5 -1 7 -1 -1 6 -1 -1 -1 -1 -1

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		System.out.println("\nMethod1");
		printLevelWise(root);
		System.out.println("\n \nMethod2");
		printLevelWise2(root);
	}
}
