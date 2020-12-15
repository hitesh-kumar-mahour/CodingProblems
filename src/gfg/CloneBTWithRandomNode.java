package gfg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//Complete the function below
//Tree is as follows:
class Tree{
	int data;
	Tree left,right,random;
	Tree(int d){
		data=d;
		left=null;
		right=null;
		random=null;
	}
}
public class CloneBTWithRandomNode{
    
	public static Tree cloneTree(Tree root){
       HashMap<Tree, Tree>map=new HashMap<>();
	   
	    Queue<Tree> pending=new LinkedList<Tree>();
		pending.add(root);
		pending.add(null);
		while(!pending.isEmpty())
		{
			Tree currNode=pending.remove();
			
			if(pending.isEmpty())
				  break;
			
			if(currNode==null)
			{
				// System.out.println();
				pending.add(null);
				
			}
			else
			{
				
				// System.out.print(currNode.data+" ");
			    Tree temp=new Tree(currNode.data);
			    map.put(currNode, temp);
			
				if(currNode.left!=null)
					pending.add(currNode.left);
				if(currNode.right!=null)
					pending.add(currNode.right);
			}
		}
		
		Tree root_clone=map.get(root);
		
		pending.add(root);
		pending.add(null);
		while(!pending.isEmpty())
		{
			Tree currNode=pending.remove();
			
			if(pending.isEmpty())
				  break;
			
			if(currNode==null)
			{
				// System.out.println();
				pending.add(null);
				
			}
			else
			{
				
				map.get(currNode).left=map.get(currNode.left);
				map.get(currNode).right=map.get(currNode.right);
			map.get(currNode).random=map.get(currNode.random);
			
			
				if(currNode.left!=null)
					pending.add(currNode.left);
				if(currNode.right!=null)
					pending.add(currNode.right);
			}
		}
		
	
		return root_clone;
     }
}