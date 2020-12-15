package lec16_trees;

import java.util.Scanner;

import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.QueueUsingLL;

public class TreeInput {
	
	public static int treeHeight(TreeNode<Integer>root)
	{
		int maxH=0;
		
		for(int i=0;i<root.children.size();i++)
		{
			int heightchild=0;
			heightchild+=treeHeight(root.children.get(i));
			if(maxH<heightchild)
				maxH=heightchild;
		}
		return maxH+1;
	}
	
	public static int count(TreeNode<Integer>root)
	{
		int count=1;
		for(int i=0;i<root.children.size();i++){
			count=count+count(root.children.get(i));
		}
		return count;
	}
	
	public static void printTreeR(TreeNode<Integer>root)
	{
		if(root==null)
			return ;
		String toBePrinted=root.data+";";
		for(int i=0;i<root.children.size();i++)
		{
			toBePrinted+=root.children.get(i).data+",";
		}
		System.out.println(toBePrinted);
		for(int i=0;i<root.children.size();i++)
			printTreeR(root.children.get(i));
		
	}
	
	public static void printTreeIT(TreeNode<Integer>root) throws QueueEmptyException
	{
		QueueUsingLL<TreeNode<Integer>>pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
	 while(!pendingNodes.isEmpty())
	 {
		 TreeNode<Integer>currentNode=pendingNodes.dequeue();
		 System.out.print(currentNode.data+";");
		 for(int i=0;i<currentNode.children.size();i++)
		 {
			 System.out.print(currentNode.children.get(i).data+", ");
			 pendingNodes.enqueue(currentNode.children.get(i));
		 }
		 System.out.println();
	 }

	}
	
	public static TreeNode<Integer> treeInputIT() throws QueueEmptyException {
		Scanner s = new Scanner(System.in);
		System.out.println("enter data");
		TreeNode<Integer> root = new TreeNode<>(s.nextInt());
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> currNode = pendingNodes.dequeue();
			System.out.println("enter no. of children");
			int numchildren = s.nextInt();

			for (int i = 0; i < numchildren; i++) {
				System.out.println("enter data");
				TreeNode<Integer> child = new TreeNode<>(s.nextInt());
				currNode.children.add(child);
				pendingNodes.enqueue(child);

			}
		}
	return root;
	}
//1 3 2 3 4 1 5 1 6 1 7 0 0 0
	public static void main(String[] args) throws QueueEmptyException {
	
	TreeNode<Integer>root=treeInputIT();	
	printTreeIT(root);
	System.out.println("size="+count(root));
	}

}
