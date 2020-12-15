package assignment13_BST_BT;

import lec13_LinkedList.Node;
import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;


public class Q7 {
 /*in this program we have added reference to each node of BST in linked list 
   in descending order and then value at each node in list is changed accordingly */
	
	public static BinaryTreeNode<Integer> replaceWithGreater(BinaryTreeNode<Integer>root)
	{
//		time complexity O(n)    space complexity O(n)
		Node<BinaryTreeNode<Integer>> head=BSTtoDescendingLL(root);
		int sum=head.data.data;
		Node<BinaryTreeNode<Integer>> temp=head.next;
		while(temp!=null)
		{
			temp.data.data+=sum;
			sum=temp.data.data;
			temp=temp.next;
		}
		return root;
	}

	public static Node<BinaryTreeNode<Integer>> BSTtoDescendingLL(BinaryTreeNode<Integer>root){
//	time complexity O(n)     space complexity O(n)		
		if(root==null)
			return null;
		Node<BinaryTreeNode<Integer>> headR=BSTtoDescendingLL(root.right);
		Node<BinaryTreeNode<Integer>>newNode=new Node<BinaryTreeNode<Integer>>(root);
		Node<BinaryTreeNode<Integer>> last=headR;
		if(last==null)
		{
			headR=newNode;
			last=newNode;
		}
		else
		{
			while(last.next!=null)
				last=last.next;
			
			last.next=newNode;
			last=newNode;
		}
		
		Node<BinaryTreeNode<Integer>> headL =BSTtoDescendingLL(root.left);
		
		last.next=headL;
		
		return headR;
	}
//	10 8 14 6 9 12 15 2 7 -1 -1 11 13 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) throws QueueEmptyException {

		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
		BinaryTreeNode<Integer>Nroot=replaceWithGreater(root);
//		Node<BinaryTreeNode<Integer>> head=BSTtoDescendingLL(root);
//		Node<BinaryTreeNode<Integer>> temp=head;
//		while(temp!=null)
//			{
//			System.out.println(temp.data.data);
//			temp=temp.next;
//			}
		BinaryTreeUse.printIT(Nroot);
	}

}
