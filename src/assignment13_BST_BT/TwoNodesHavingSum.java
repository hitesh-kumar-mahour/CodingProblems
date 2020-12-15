package assignment13_BST_BT;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class TwoNodesHavingSum {

	public static boolean ifPresent(BinaryTreeNode<Integer> mainroot, BinaryTreeNode<Integer> currentroot, int sum) 
	{
		if(currentroot==null)
			return false;
		int val=sum; 
		val=val-currentroot.data;
		if(val>0)
		{  
			boolean present=findNode(mainroot,val);
			if(present)
				return true;
		}
		ifPresent(mainroot, currentroot.left, sum);
		ifPresent(mainroot, currentroot.right, sum);
		return false;	
	}
	public static boolean findNode(BinaryTreeNode<Integer> root, int val) {

		if(root==null)
			return false;
		if(root.data==val)
			return true;
		
		boolean ans1=findNode(root.left, val);
		if(ans1)
			return true;
		boolean ans2=findNode(root.right, val);
			return ans2;
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
  BinaryTreeNode<Integer> root=BinaryTreeUse.InputBinaryTree();
 System.out.println(ifPresent(root, root, 1000));
	
	}

	

}
