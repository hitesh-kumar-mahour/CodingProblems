package gfg;
import java.util.*;

public class StronglyConnectedComponentsDirectedGraph {

//	https://practice.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1
//	https://www.youtube.com/watch?v=paexK7dOGL8&ab_channel=CodingNinjasIndia
	
    public int kosaraju(ArrayList<ArrayList<Integer>> g, int N)
    {
        // Write your code here
        
        Stack<Integer> explored = new Stack<>();
        HashSet<Integer> visited = new HashSet<Integer>();
        for(int i=0;i<g.size();i++) {
        	if(!visited.contains(i)) {
        		visited.add(i);
        		dfs1(i,g,visited,explored);
        	}
        }
        
        g = reverse(g);

        visited = new HashSet<Integer>();
        int count = 0;
        while(!explored.isEmpty()) {
        	
        	int v = explored.pop();
        	if(!visited.contains(v)) {
        		visited.add(v);
        		dfs2(v,g,visited);
        		count++;
        	}
        	
        }
        
        return count;
    }

    private void dfs2(int v, ArrayList<ArrayList<Integer>> g, HashSet<Integer> visited) {

    	for(int adj:g.get(v)) {
    		if(!visited.contains(adj)) {
    			visited.add(adj);
    			dfs2(adj, g, visited);
    		}
    	}
    	
	}
	
    private void dfs1(int v, ArrayList<ArrayList<Integer>> g, HashSet<Integer> visited, Stack<Integer> explored) {

    	for(int adj:g.get(v)) {
    		if(!visited.contains(adj)) {
    			visited.add(adj);
    			dfs1(adj, g, visited, explored);
    		}
    	}
    	
    	explored.push(v);
	}


	public static ArrayList<ArrayList<Integer>> reverse(ArrayList<ArrayList<Integer>>g){
        
        ArrayList<ArrayList<Integer>> g2 = new ArrayList<>();
        for(int i=0;i<g.size();i++)
            g2.add(new ArrayList<Integer>());
        
        for(int i=0;i<g.size();i++)
            for(int j : g.get(i))
                g2.get(j).add(i);
        
        return g2;
        
    }
}
