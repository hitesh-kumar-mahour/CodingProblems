package lec18_bst;

import lec13_LinkedList.LinkedListUse;
import lec13_LinkedList.Node;
import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class BSTtoLL {

	public static Node<Integer> BSTtoSortedLL(BinaryTreeNode<Integer> root) {
		
		
		if(root==null)
			return null;
		Node<Integer> headL =BSTtoSortedLL(root.left);
	
		Node<Integer>newNode=new Node<Integer>(root.data);
		Node<Integer> last=headL;
		if(last==null)
		{
			headL=newNode;
			last=newNode;
		}
		else
		{
			while(last.next!=null)
				last=last.next;
			
			last.next=newNode;
			last=newNode;
		}
		
		Node<Integer> headR =BSTtoSortedLL(root.right);
		
		last.next=headR;
		
		return headL;
	}
//	8 3 10 1 6 9 15 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) throws QueueEmptyException {

		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
		Node<Integer> head=BSTtoSortedLL(root);
		LinkedListUse.printList(head);
	}

	

}
