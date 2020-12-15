package lec17_binaryTree;

import lec15_stacksNqueues.QueueEmptyException;

class ReturnTypeDiameter {

	int height;
	int diameter;
	public ReturnTypeDiameter(int height, int diameter) {
		
		this.height=height;
		this.diameter=diameter;
	}
}

public class Diameter {

	
	public static int treeHeight(BinaryTreeNode<Integer>root){
		//time complexity is O(n)
		if(root==null)
			return 0;
		
		int	heightL=treeHeight(root.left);
		int heightR=treeHeight(root.right);

		return Math.max(heightL, heightR)+1;
	}
	
	public static int findDiameter(BinaryTreeNode<Integer> root) {
// time complexity is O(n)*O(n)=O(n^2)
		if(root==null)
			return 0;
		int leftHeight=treeHeight(root.left);//O(n)
		int rightHeight=treeHeight(root.right);//O(n)
		int leftDia=findDiameter(root.left);
		int rightDia=findDiameter(root.right);
		return Math.max( Math.max(leftHeight+rightHeight+1,leftDia),rightDia);
		
	}
	
	public static ReturnTypeDiameter find_diameter(BinaryTreeNode<Integer> root) {
		// time complexity is O(n)
		if(root==null)
		{
			ReturnTypeDiameter ans=new ReturnTypeDiameter(0,0);
			return ans;
		}
		
		ReturnTypeDiameter left=find_diameter(root.left);
		ReturnTypeDiameter right=find_diameter(root.right);
		
		int height=Math.max(left.height,right.height)+1;
		int diameter=Math.max(Math.max(left.height+right.height+1,left.diameter),right.diameter);
		
		ReturnTypeDiameter ans=new ReturnTypeDiameter(height,diameter);
		return ans;
		
		
	}
//	1 2 3 4 5 -1 6 -1 -1 7 8 -1 9 -1 -1 -1 -1 10 11 12 13 -1 -1 -1 -1 -1 -1
//   1 2 3 4 5 -1 6 7 8 -1 9 -1 -1 -1 -1 10 -1 11 12 13 14 -1 -1 -1 15 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer>root =BinaryTreeUse.InputBinaryTree();
		ReturnTypeDiameter ans=find_diameter(root);
		System.out.println(ans.height+"\n"+ans.diameter);
//		System.out.println(findDiameter(root));
	}

	
}
