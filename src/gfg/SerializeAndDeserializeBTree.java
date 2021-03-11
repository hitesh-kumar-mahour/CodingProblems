package gfg;

import java.util.*;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

//http://www.geeksforgeeks.org/serialize-deserialize-binary-tree
public class SerializeAndDeserializeBTree {
	
	
	//O(n) time 
	public static void serailize_BTree_preorder(BinaryTreeNode<Integer> root,Queue<Integer> q) {
		
		if(root==null){
			q.add(-1);
			return;
		}
		
		q.add(root.data);
		
		serailize_BTree_preorder(root.left, q);
		serailize_BTree_preorder(root.right, q);
	}

	//O(n) time
	public static BinaryTreeNode<Integer> deserailize_BTree(Queue<Integer> q) {
		if(q==null || q.isEmpty())
			return null;
		
		int curr = q.remove();
		
		if(curr==-1)
			return null;
		
		BinaryTreeNode<Integer> temp=new BinaryTreeNode<>(curr);
		temp.left=deserailize_BTree(q);
		temp.right=deserailize_BTree(q);
		return temp;
	}

	public static void inorderTraversal(BinaryTreeNode<Integer>root){
		if(root==null)
			return;
		
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
	
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		Queue<Integer> preorder_of_BTree= new LinkedList<>();
		serailize_BTree_preorder(root,preorder_of_BTree);
		
		
		BinaryTreeNode<Integer> root2=deserailize_BTree(preorder_of_BTree);
		BinaryTreeUse.printIT(root2);
//		inorderTraversal(root2);
	}

	

}
