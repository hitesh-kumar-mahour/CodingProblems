package lec23_graph2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {

	public static Boolean ifBipartiteBFS(GraphUndirectedString g) {
//		http://www.geeksforgeeks.org/bipartite-graph/
//		the idea is that no two consecutive nodes should of same type 
		
		HashMap<VertexString,Boolean>visited=new HashMap<>();//map for storing node and node color
		
		for(VertexString v: g.vertices)
		{	
			if(!visited.containsKey(v))
			{	
				Queue<VertexString>pending =new LinkedList<VertexString>();
				
				visited.put(v,true);
				pending.add(v);
				
				while(!pending.isEmpty())
				{
					VertexString curr=pending.remove();
					
					ArrayList<VertexString> allAdj=curr.getAdjacent();

					for(VertexString adj:allAdj)
					{
						if(visited.containsKey(adj))
						{
							if(visited.get(curr)==visited.get(adj))//adjacent vertices of same type
								return false;
						}
						else
						{
							visited.put(adj,!visited.get(curr));
							pending.add(adj);
						}
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		GraphUndirectedString g=new GraphUndirectedString();
		g.addVertex("1");
		g.addVertex("2");
		g.addVertex("3");
		g.addVertex("4");
		g.addVertex("5");
		g.addVertex("6");
		g.addVertex("7");
		g.addVertex("8");
		g.addVertex("9");
		g.addVertex("10");
		g.addVertex("11");
		g.addVertex("12");
		g.addEdge("1", "3");
		g.addEdge("1", "2");
		g.addEdge("1", "4");
		g.addEdge("3", "5");
		g.addEdge("4", "5");
		g.addEdge("7", "6");
		g.addEdge("6", "8");
		g.addEdge("8", "7");
//		g.addEdge("9", "10");
//		g.addEdge("10", "11");
//		g.addEdge("11", "12");
//		g.addEdge("12", "9");
		
		System.out.println(ifBipartiteBFS(g));
	
	}
	
	
}
