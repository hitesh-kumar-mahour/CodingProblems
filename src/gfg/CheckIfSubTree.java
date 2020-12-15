package gfg;



import lec15_stacksNqueues.QueueEmptyException;
import lec17_binaryTree.BinaryTreeNode;
import lec17_binaryTree.BinaryTreeUse;

public class CheckIfSubTree {

	
	public static boolean isSubTree(BinaryTreeNode<Integer>rootT,BinaryTreeNode<Integer> rootS) {
		
		if(rootT==null)
			return false;
			
		if(rootT.data==rootS.data)
		{
			if(isIdentical(rootT,rootS))
				return true; 
		}
		
		return isSubTree(rootT.left, rootS)||isSubTree(rootT.right, rootS); 
		
	}
	
	private static boolean isIdentical(BinaryTreeNode<Integer> rootT, BinaryTreeNode<Integer> rootS) {
		
		if(rootT==null && rootS==null)
			return true;
		
		if(rootT==null || rootS==null)
			return false;
		
		if(rootT.data!=rootS.data)
			return false;
		
		return isIdentical(rootT.left, rootS.left)&&isIdentical(rootT.right, rootS.right);
		
	}

	public static void main (String[] args) throws QueueEmptyException {
	    
    	BinaryTreeNode<Integer> rootT=BinaryTreeUse.InputBinaryTree();
    	BinaryTreeNode<Integer> rootS=BinaryTreeUse.InputBinaryTree();
    	
    	System.out.println(isSubTree(rootT, rootS));
    	
	}
}
