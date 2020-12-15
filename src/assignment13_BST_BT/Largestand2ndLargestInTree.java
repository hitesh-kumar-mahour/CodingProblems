package assignment13_BST_BT;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class Largestand2ndLargestInTree {

	public static int largest(BinaryTreeNode<Integer>root)
	{
		if(root==null)
			return 0;
		int largest=root.data;
		int leftLargest=largest(root.left);
		if(largest<leftLargest)
			largest=leftLargest;
		int rightLargest=largest(root.right);
		if(largest<rightLargest)
			largest=rightLargest;
		
		return largest;
	}
	public static largest_secondLargest_returntype largest_2ndLargest(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			largest_secondLargest_returntype ans=null;
			return ans;
		}
		
		largest_secondLargest_returntype ans=new largest_secondLargest_returntype();
		ans.largest=root.data;
		ans.secondLargest=0;
		
		largest_secondLargest_returntype leftans=largest_2ndLargest(root.left);
		if(leftans!=null)
		{
				if(ans.largest<leftans.secondLargest)
			{
				ans.largest=leftans.largest;
				ans.secondLargest=leftans.secondLargest;
			}
				
			else if(ans.largest<leftans.largest&&ans.largest>leftans.secondLargest)
			{
				ans.secondLargest=ans.largest;
				ans.largest=leftans.largest;
			}
			else //(ans.secondLargest<leftans.largest)
				ans.secondLargest=leftans.largest;	
			
		}
		
		largest_secondLargest_returntype rightans=largest_2ndLargest(root.right);
		if(rightans!=null)
		{
				if(ans.largest<rightans.secondLargest)
			{
				ans.largest=rightans.largest;
				ans.secondLargest=rightans.secondLargest;
			}
				
				else if(ans.largest<rightans.largest&&ans.largest>rightans.secondLargest)
			{
				ans.secondLargest=ans.largest;
				ans.largest=rightans.largest;
			}
				else if(ans.secondLargest<rightans.largest)
				ans.secondLargest=rightans.largest;	
		}
	return ans;
	}
	
	public static void main(String[] args) throws QueueEmptyException {

		BinaryTreeNode<Integer>root=BinaryTreeUse.InputBinaryTree();
		largest_secondLargest_returntype ans=largest_2ndLargest(root);
		System.out.println("largest="+ans.largest+" second largest="+ans.secondLargest);
	}

}
