package gfg;
import java.util.*;

public class DetectCycleDirectedGraph {

    static boolean isCyclic(ArrayList<ArrayList<Integer>> g, int N)
    {

        HashMap<Integer,Integer>visited=new HashMap<>();
        HashMap<Integer,Integer>explored=new HashMap<>();
      
          for(int i=0;i<N;i++){
              if(!explored.containsKey(i)){
                    visited.put(i,-1);
                    if(isCyclicDFS(i,visited,explored,g))
                        return true;
              }
          }
       return false;
    }
    
    public static boolean isCyclicDFS(int v,HashMap<Integer,Integer>visited,HashMap<Integer,Integer>explored,ArrayList<ArrayList<Integer>> g){
        
        for(int adj : g.get(v)){
            if(visited.containsKey(adj)){
                    return true;
            }
            else{
                visited.put(adj,v);
                if(isCyclicDFS(adj,visited,explored,g))
                    return true;
            }
        }
        
        explored.put(v,visited.get(v));
        visited.remove(v);
        
        return false;
        
    }

	
}
