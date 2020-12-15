package gfg;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;
//http://www.geeksforgeeks.org/serialize-deserialize-binary-tree
public class SerializeAndDeserializeBTree {
	
	
	//O(n) time
	public static void serailize_BTree(BinaryTreeNode<Integer> root,ArrayList<Integer> list) {
		
		if(root==null)
		{
			list.add(-1);
			return;
		}
		
		list.add(root.data);
		
		serailize_BTree(root.left, list);
		serailize_BTree(root.right, list);
	}

	//O(n^2) time
	public static BinaryTreeNode<Integer> deserailize_BTree(ArrayList<Integer> list) {
	
		int curr=list.remove(0);//O(n) time
		
		if(curr==-1)
			return null;
		
		BinaryTreeNode<Integer> temp=new BinaryTreeNode<>(curr);
		temp.left=deserailize_BTree(list);
		temp.right=deserailize_BTree(list);
		return temp;
	}

	public static void inorderTraversal(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return;
		
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		ArrayList<Integer> preorder_of_BTree= new ArrayList<>();
		serailize_BTree(root,preorder_of_BTree);
		
//		for (int i = 0; i < preorder_of_BTree.size(); i++) {
//			System.out.print(preorder_of_BTree.get(i)+" ");
//		}
		
		BinaryTreeNode<Integer> root2=deserailize_BTree(preorder_of_BTree);
//		BinaryTreeUse.printIT(root2);
		inorderTraversal(root2);
	}

	

}
