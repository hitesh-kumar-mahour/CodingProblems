package assignment12BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class DiagonalTraversal {

	public static void main(String[] args) throws QueueEmptyException {
		
		BinaryTreeNode<Integer> root =BinaryTreeUse.InputBinaryTree();
		printDiagonaly(root);
		
	}

//	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

	public static void printDiagonaly(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pending=new LinkedList<BinaryTreeNode<Integer>>();
		pending.add(root);
		pending.add(null);
		
		while(!pending.isEmpty())
		{
			BinaryTreeNode<Integer> curr=pending.remove();
			if(curr==null)
			{
				if(pending.isEmpty())
						return;
				else{
						pending.add(null);
						System.out.println();
					}
			}
		
		else{
				while(curr!=null)
				{
					System.out.print(curr.data+" ");
					
					if(curr.left!=null)
						pending.add(curr.left);
					
					curr=curr.right;
				}
			}
			
		}
		
	}
}
