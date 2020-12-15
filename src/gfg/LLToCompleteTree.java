package gfg;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
int data;
TreeNode left;
TreeNode right;
TreeNode(int d){
	data=d;
	left=null;
	right=null;
}
}
class NodeLL {
    int data;
    NodeLL next;
    NodeLL(int d) {
        data = d;
        next = null;
    }
}
public class LLToCompleteTree{

	public static TreeNode convert(NodeLL head,TreeNode root){

		Queue<TreeNode> q=new LinkedList<TreeNode>();
		NodeLL tail=head;
		root=new TreeNode(tail.data);
		q.add(root);
		
		while(tail.next!=null)
		{
			TreeNode currNode=q.remove();
			
			if(tail.next!=null)
			{
				tail=tail.next;
				currNode.left=new TreeNode(tail.data);
				q.add(currNode.left);
			}
			if(tail.next!=null)
			{
				tail=tail.next;
				currNode.right=new TreeNode(tail.data);
				q.add(currNode.right);
			}
			
		}
		
		return root;
	}
	
}