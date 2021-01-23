package gfg;
import java.util.*;

class NodeA{
	int data;
	NodeA left,right;
}
public class NodesAtDistanceK {

    public static void KDistanceNodesDown(NodeA root, int k, ArrayList<Integer>ans){
        
        if(root==null || k<0)
            return;
        if(k==0){
            ans.add(root.data);
            return;
        }
        
        KDistanceNodesDown(root.left,k-1,ans);
        KDistanceNodesDown(root.right,k-1,ans);
        
    }

    public static int KDistanceNodes(NodeA root,int target, int k, ArrayList<Integer> ans){
        if(root==null)
            return -1; 
            
        if(root.data == target){
            KDistanceNodesDown(root,k,ans);
            return 0;
        }
            
        int l = KDistanceNodes(root.left,target,k,ans);
        if(l>=0){
            if(l+1==k)
                ans.add(root.data);
            else
                KDistanceNodesDown(root.right,k-2-l,ans);
            return l+1;
        }
        
        int r = KDistanceNodes(root.right,target,k,ans);
        if(r>=0){
            if(r+1==k)
                ans.add(root.data);
            else
                KDistanceNodesDown(root.left,k-2-r,ans);
            return r+1;
        }

        return -1;
    }
    
    
    public static ArrayList<Integer> KDistanceNodes(NodeA root, int target , int k){

        ArrayList<Integer> ans = new ArrayList<>();

        if(root==null || k<0)
            return ans;
        
        KDistanceNodes(root,target,k,ans);
        Collections.sort(ans);
        return ans;

    }
	
}
