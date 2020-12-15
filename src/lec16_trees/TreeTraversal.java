package lec16_trees;

import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.StackEmptyException;
import lec15_stacksNqueues.StackUsingLL;

public class TreeTraversal {

	public static void preOrderTraversalR(TreeNode<Integer>root)
	{
		System.out.println(root.data);
		for(int i=0;i<root.children.size();i++)
		{
			preOrderTraversalR(root.children.get(i));
		}
		
	}
	
	public static void postOrderTraversalR(TreeNode<Integer>root)
	{
		for(int i=0;i<root.children.size();i++)
		{
			postOrderTraversalR(root.children.get(i));
		}
		System.out.println(root.data);
	}
	
	public static void preorderTraversalIT(TreeNode<Integer>root) throws StackEmptyException
	{
		StackUsingLL<TreeNode<Integer>> pendingNodes=new StackUsingLL<>();
		pendingNodes.push(root);
		
		while(pendingNodes.size()!=0)
		{
			TreeNode<Integer> currentNode=pendingNodes.pop();
			System.out.println(currentNode.data);
			for(int i=currentNode.children.size()-1;i>=0;i--)
			{
				pendingNodes.push(currentNode.children.get(i));
			}
		}
	}
	
	public static void inorderTraversalIT(TreeNode<Integer>root) throws StackEmptyException{
		
		
	}

	
	
	//1 3 2 3 4 1 5 1 6 1 7 0 0 0
	public static void main(String[] args) throws QueueEmptyException, StackEmptyException {
		
		TreeNode<Integer>root=lec16_trees.TreeInput.treeInputIT();
//		preOrderTraversalR(root);
//		postOrderTraversalR(root);
		preorderTraversalIT(root);
	}
	
	
}
