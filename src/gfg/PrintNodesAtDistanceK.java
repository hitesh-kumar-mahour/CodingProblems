package gfg;

import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class PrintNodesAtDistanceK {

	public static void printkdistanceNodeDown(BinaryTreeNode<Integer> root, int k)
	{
	    if(k<0||root==null)
	      return;
	    
	    if(k==0)
	    {
	        System.out.print(root.data+" ");
	        return;
	    }
	    
	    printkdistanceNodeDown(root.left,k-1);
	    printkdistanceNodeDown(root.right,k-1);
	}

	public static int fun(BinaryTreeNode<Integer> root,BinaryTreeNode<Integer> target , int n)
	{
	    if(root==null)
	        return -99999999;
	    if(root==target)
	        return 0;
	    
	    int l=fun(root.left,target,n)+1;
	    if(l>0)
	    {
	        if(l==n)
	        {
		        System.out.print(root.data+" ");
	        }
	        else if(l<n)
	        {
	              printkdistanceNodeDown(root.right,n-l-1);
	        }
	        
	            return l;
	    }
	    
	    int r=fun(root.right,target,n)+1;
	    
	    if(r>0)    
	    {
	        if(r==n)
	        {
		        System.out.print(root.data+" ");
	        }
	        else if(r<n)
	        {
	              printkdistanceNodeDown(root.left,n-r-1);
	        }
	        
	            return r;
	    }
	    
	    return -99999999;
	    
	}


	public static void printkdistanceNode (BinaryTreeNode<Integer> root,BinaryTreeNode<Integer> target , int k)
	{
	    printkdistanceNodeDown(target,k);
	    fun(root,target,k);
	}
	
	
}
