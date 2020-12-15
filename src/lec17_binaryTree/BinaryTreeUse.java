package lec17_binaryTree;

import java.util.Scanner;
import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.QueueUsingLL;
import lec16_trees.TreeNode;

public class BinaryTreeUse {
	
	
	public static void mirrorBT(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return ;
		
		BinaryTreeNode<Integer>temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		mirrorBT(root.left);
		mirrorBT(root.right);
		
	}
	
	public static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer>root,int val)
	{
		if(root==null)
			return null;
		if(root.data==val)
			return root;
		
		BinaryTreeNode<Integer>node1=findNode(root.left, val);
		if(node1!=null)
			return node1;
		BinaryTreeNode<Integer>node2=findNode(root.right, val);
			return node2;
		
	}

	public static int treeHeight(BinaryTreeNode<Integer>root)
	{//time complexity is O(n)
		if(root==null)
			return 0;
		
		int	heightL=treeHeight(root.left);
		int heightR=treeHeight(root.right);
		
		if(heightL>heightR)
		  return heightL+1;
		else
			return heightR+1;
		
	}
	
	public static void printIT(BinaryTreeNode<Integer>root) throws QueueEmptyException
	{
		if(root==null)
			return;
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> currentNode=pendingNodes.dequeue();
			System.out.print(currentNode.data+";");
			
			if(currentNode.left!=null)
			{
				System.out.print(currentNode.left.data+",");
				pendingNodes.enqueue(currentNode.left);
			}
			if(currentNode.right!=null)
			{	
				System.out.print(currentNode.right.data+",");
				pendingNodes.enqueue(currentNode.right);
			}
			System.out.println();
		}
		
	}
	
	public static void printR(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return;
		String toBePrinted=root.data+";";
		if(root.left!=null)
			toBePrinted+=root.left.data+",";
		if(root.right!=null)
			toBePrinted+=root.right.data+",";
		
		System.out.println(toBePrinted);
		
		printR(root.left);
		printR(root.right);
	}
	
	public static BinaryTreeNode<Integer> InputBinaryTree() throws QueueEmptyException
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter root");
		BinaryTreeNode<Integer> root=null;
		int rootData= s.nextInt();
		if(rootData!=-1)
	{
			root=new BinaryTreeNode<Integer>(rootData);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer>currentNode=pendingNodes.dequeue();
			
			System.out.println("enter left child of "+currentNode.data);
			int Lchild=s.nextInt();
			if(Lchild!=-1)
			{
				BinaryTreeNode<Integer> left=new BinaryTreeNode<Integer>(Lchild);
				currentNode.left=left;
				pendingNodes.enqueue(left);
			}
			
			System.out.println("enter right child of "+currentNode.data);
			int Rchild=s.nextInt();
			if(Rchild!=-1)
			{
				BinaryTreeNode<Integer> right=new BinaryTreeNode<Integer>(Rchild);
				currentNode.right=right;
				pendingNodes.enqueue(right);
			}
			
		}
	}
		
		return root;
	}
	
	//12 6 7 -1 13 9 -1 -1 -1 -1 -1
	public static void main(String[] args) throws QueueEmptyException {
		
		BinaryTreeNode<Integer>root=InputBinaryTree();
		printIT(root);
		System.out.println("\nheight="+treeHeight(root));
//		findNode(root, 5);
//		mirrorBT(root);
//		printIT(root);
	}
}
