package lec18_bst;

import lec14_doublyLL.DoublyLLNode;
import lec14_doublyLL.DoublyLLUse;
import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class LLtoBST {

	public static DoublyLLNode<Integer> findmid(DoublyLLNode<Integer> head){
//		time complexity O(n)
		if(head == null){
			return null;
		}
		DoublyLLNode<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast.next==null)
		return slow;
		else
			return slow.next;
	}
	
	public static BinaryTreeNode<Integer> sortedLLtoBST(DoublyLLNode<Integer>head)
	{  // time complexity O(nlogn)
		if(head==null)
			return null;
		
		DoublyLLNode<Integer> mid=findmid(head);
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(mid.data);
		
		if(mid==head)
		{
			head=null;
		}
		else
		{
			mid.prev.next=null;
			mid.prev=null;
		}
			
		
		BinaryTreeNode<Integer> rootL=sortedLLtoBST(head);
		
		root.left=rootL;
		
		head=mid.next;
		if(head!=null)
		{
		mid.next=null;
		head.prev=null;
		}
		BinaryTreeNode<Integer> rootR=sortedLLtoBST(head);

		root.right=rootR;
      
		return root;
    }
	public static void inorderPrint(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return;
		inorderPrint(root.left);
		System.out.println(root.data);
		inorderPrint(root.right);
	}

public static void main(String[] args) throws QueueEmptyException {
	DoublyLLNode<Integer> head=DoublyLLUse.InputDoblyLL();
	BinaryTreeNode<Integer> root=sortedLLtoBST(head);
	BinaryTreeUse.printIT(root);
    }
}
