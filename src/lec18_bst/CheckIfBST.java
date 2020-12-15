package lec18_bst;



import lec13_LinkedList.Node;
import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;


class Prev{
	int data;
	Prev(int data)
	{
		this.data=data;
	}
}

public class CheckIfBST {
	
	
	
	public static boolean isBstMethod2(BinaryTreeNode<Integer> root)  
    {
//		 time complexity O(n)
//		 space complexity O(1)
//		here Prev is used as pointer to integer to store prev visited value instead of maintaing a list
        return isBSTUtil(root,new Prev(Integer.MIN_VALUE));
    }
	
    
	public static boolean isBSTUtil(BinaryTreeNode<Integer> root, Prev prev){
    if(root==null)
    return true;
    
    boolean left=isBSTUtil(root.left, prev);
    if(!left)
    return false;
    
    if(prev.data > root.data)
    return false;
    
    prev.data=root.data;
    
    return isBSTUtil(root.right,prev);
}
	

	public static boolean isLLSorted(Node<Integer> head) {
//	 time complexity O(n)
//	 space complexity O(n)
		Node<Integer>temp=head;
		while(temp.next!=null)
		{
			if(temp.data<temp.next.data)
				temp=temp.next;
			else
				return false;
		}
		return true;
	}
	
	public static boolean isBST(BinaryTreeNode<Integer>root)
	{
		Node<Integer> head=BSTtoLL.BSTtoSortedLL(root);
		return isLLSorted(head);
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
		System.out.println("\n"+isBstMethod2(root));
		
	}

	
	
	
}
