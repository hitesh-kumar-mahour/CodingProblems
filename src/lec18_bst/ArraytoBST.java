package lec18_bst;

import java.util.Scanner;

class TreeNode{
    
    int data;
    TreeNode right;
    TreeNode left;
    
    TreeNode(int data)
    {
        this.data=data;
    }
}

public class ArraytoBST {
    
    public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		int[]a=new int[size];//ascending array
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		
//		System.out.print("hello ");
		TreeNode root=ConvertToBST(a,0,size-1);
 		preorder_tree_traversal(root);
	}
	
	

 	public static void preorder_tree_traversal(TreeNode root) {
		
 		if(root==null)
 			return ;
 		System.out.print(root.data+" ");
 		preorder_tree_traversal(root.left);
 		preorder_tree_traversal(root.right);
 	}



 	private static TreeNode ConvertToBST(int[] a, int b, int e) {

 		if(b>e)
 		return null;
		
 		int m=(e+b)/2;
		
 		TreeNode temp=new TreeNode(a[m]);
 		temp.left=ConvertToBST(a, b, m-1);
 		temp.right=ConvertToBST(a, m+1, e);
 		return temp;
		
 	}
}
