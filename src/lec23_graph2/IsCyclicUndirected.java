package lec23_graph2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class IsCyclicUndirected {
	
	
	
	public static Boolean ifCyclicBFS(GraphUndirectedString g) {

		HashMap<VertexString, VertexString>visited=new HashMap<>();//map for storing node and parent node
		
		for(VertexString v: g.vertices)
		{	
			if(!visited.containsKey(v))
			{	
				Queue<VertexString>pending =new LinkedList<VertexString>();
				
				visited.put(v,null);
				pending.add(v);
				
				while(!pending.isEmpty())
				{
					VertexString curr=pending.remove();
					
					ArrayList<VertexString> allAdj=curr.getAdjacent();

					for(VertexString adj:allAdj)
					{
						if(visited.containsKey(adj))
						{
							if(visited.get(curr)==adj)
								continue;
							else
								return true;
						}
						else
						{
							visited.put(adj,curr);
							pending.add(adj);
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean detectLoopDFS(GraphUndirectedString g) {
		
		HashMap<VertexString, VertexString> visited=new HashMap<>();//map for storing node and parent node
 		for(VertexString v:g.vertices)
 		{
 			if(!visited.containsKey(v))
 			{
 				visited.put(v, null);
 				if(detectLoopDFS(v,visited))
 					return true;
 			}
 		}
 		return false;
	}

	private static boolean detectLoopDFS(VertexString currV, HashMap<VertexString, VertexString> visited) {
		
		for(VertexString adjV : currV.getAdjacent())
		{
			if(visited.containsKey(adjV))
			{
				if(visited.get(currV)==adjV)//adjacentVertex is the parent vertex
					continue;
				else 
					return true;
			}
			else
			{
				visited.put(adjV,currV);
				if(detectLoopDFS(adjV, visited))
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		GraphUndirectedString g=new GraphUndirectedString();
		g.addVertex("1");
		g.addVertex("2");
		g.addEdge("1", "2");
		
//		g.addVertex("3");
//		g.addVertex("4");
//		g.addVertex("5");
//		g.addVertex("6");
//		g.addVertex("7");
//		g.addVertex("8");
//		g.addVertex("9");
//		g.addVertex("10");
//		g.addVertex("11");
//		g.addVertex("12");
//		g.addEdge("1", "3");
//		g.addEdge("2", "3");
////		g.addEdge("4", "3");
//		g.addEdge("4", "6");
////		g.addEdge("4", "5");
//		g.addEdge("5", "6");
//		g.addEdge("6", "8");
//		g.addEdge("8", "7");
//		g.addEdge("9", "10");
//		g.addEdge("10", "11");
//		g.addEdge("11", "12");
//		g.addEdge("12", "9");
		
		System.out.println(ifCyclicBFS(g));
		System.out.println(detectLoopDFS(g));
	}

	    boolean isCyclic(int V,LinkedList<Integer>[] alist)
	    {
	       HashMap<Integer, Integer>visited=new HashMap<>();//map for storing node and parent node
			
			for(int v=0;v<V;v++)
			{	
				if(!visited.containsKey(v))
				{	
					Queue<Integer>pending =new LinkedList<Integer>();
					
					visited.put(v,-1);
					pending.add(v);
					
					while(!pending.isEmpty())
					{
						int curr=pending.remove();
						
						LinkedList<Integer> allAdj=alist[curr];

						for(int adj:allAdj)
						{
							if(visited.containsKey(adj))
							{
								if(visited.get(curr)==adj)
									continue;
								else
									return true;
							}
							else
							{
								visited.put(adj,curr);
								pending.add(adj);
							}
						}
					}
				}
			}
			return false;
	    }
	
}
