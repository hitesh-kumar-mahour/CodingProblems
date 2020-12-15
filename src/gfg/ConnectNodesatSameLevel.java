package gfg;

import java.util.LinkedList;
import java.util.Queue;

import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

//http://www.geeksforgeeks.org/connect-nodes-at-same-level/

class TCNode
{
    int data;
    TCNode left, right, nextRight;

    TCNode(int item)
    {
        data = item;
        left = right = nextRight = null;
		
    }
}

public class ConnectNodesatSameLevel {

	public static void connect(TCNode root)
	{
		Queue<TCNode> q=new LinkedList<TCNode>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
		{
			TCNode currNode=q.remove();
			
			if(currNode==null)
			{
				if(q.isEmpty())
					return;
				
				q.add(null);
				continue;
			}
			
			currNode.nextRight=q.peek();
			
			if(currNode.left!=null)
				q.add(currNode.left);
			if(currNode.right!=null)
				q.add(currNode.right);
				
		}
		
	}
}
