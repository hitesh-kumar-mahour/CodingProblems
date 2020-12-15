package gfg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import lec15_stacksNqueues.QueueEmptyException;
//http://www.geeksforgeeks.org/reverse-level-order-traversal/
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class ReverseLevelWisePrint {

	public static void printReverseLevelWise(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		
		Stack<Integer> st=new Stack<>();
		
		Queue<BinaryTreeNode<Integer>> pending =new LinkedList<BinaryTreeNode<Integer>>();
		pending.add(root);
		
		while(!pending.isEmpty())
		{
			int count=pending.size();
			Stack<Integer> temp=new Stack<>();
			while(count>0)
			{
			    BinaryTreeNode<Integer> currNode=pending.remove();
				temp.push(currNode.data);
			
				if(currNode.left!=null)
					pending.add(currNode.left);
				if(currNode.right!=null)
					pending.add(currNode.right);
		
			  count--;		
			}
			
			while(!temp.isEmpty())
			{
			  st.push(temp.pop());  
			}
		}
		
		while(!st.isEmpty())
		System.out.println(st.pop());
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		printReverseLevelWise(root);
	}
}
