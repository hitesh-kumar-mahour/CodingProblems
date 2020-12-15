package lec17_binaryTree;

public class buildingTreeUsing_InorderPreorderTraversal {

	public static BinaryTreeNode<Integer> buildTreeUsingInorderPreorderTraversal(int[]in,int[]pre,int inB,int inE,int preB, int preE)
	{
		if(inB>inE)
			return null;
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(pre[preB]);
		
		int i;
		for( i=inB;i<=inE;i++)
		{
		 if(in[i]==pre[preB])
			 break;
		}
		
		int inLeftB=inB;
		int inLeftE=i-1;
		int inRightB=i+1;
		int inRightE=inE;
		
		int preLeftB=preB+1;
		int preRightE=preE;
		int leftLength=i-inB;
		int	preLeftE=preLeftB+leftLength-1;
		int preRightB=preLeftE+1;
		
		
		root.left=buildTreeUsingInorderPreorderTraversal(in, pre, inLeftB,inLeftE, preLeftB, preLeftE);
		root.right=buildTreeUsingInorderPreorderTraversal(in, pre, inRightB, inRightE, preRightB, preRightE);
		return root;
	}
	
	public static void main(String[] args) {
		int []pre={1,2,4,5,3,6,7};
		int[]in={4,2,5,1,6,3,7};
		BinaryTreeNode<Integer>root=buildTreeUsingInorderPreorderTraversal(in, pre, 0,6 , 0, 6);
		BinaryTreeUse.printR(root);
	}
}
