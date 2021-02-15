package lec17_binaryTree;

public class buildingTreeUsing_InorderPreorderTraversal {

    
    public static BinaryTreeNode<Integer> buildTreeUsingInorderPreorderTraversal(int inB, int inE, int preB, int in[], int pre[]){
        
        //System.out.println(inB+" "+inE+" "+preB);
        if(inE<inB)
            return null;
            
        BinaryTreeNode<Integer> root = new BinaryTreeNode(pre[preB]);
        
        int i;
        for(i=inB;i<=inE && in[i]!=pre[preB];i++);
        
        int inB_l=inB;
        int inE_l=i-1;
        int preB_l=preB+1;
        
        int inB_r=i+1;
        int inE_r=inE;
        int preB_r=preB_l+i-inB;
        
        
        root.left=buildTreeUsingInorderPreorderTraversal(inB_l,inE_l,preB_l,in,pre);
        root.right=buildTreeUsingInorderPreorderTraversal(inB_r,inE_r,preB_r,in,pre);
        
        return root;
    
    }
	
	public static void main(String[] args) {
		int []pre={1,2,4,5,3,6,7};
		int[]in={4,2,5,1,6,3,7};
		BinaryTreeNode<Integer>root=buildTreeUsingInorderPreorderTraversal(0,in.length-1,0,in,pre);
		BinaryTreeUse.printR(root);
	}
}
