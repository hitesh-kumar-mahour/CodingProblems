package lec23_graph2;

import java.util.ArrayList;
import java.util.HashMap;

import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.QueueUsingLL;

public class IsConnected {
	
/*  	if we start from any node and traverses graph using DFS/BFS, if each 
		vertex is visited then graph is connected otherwise not        */
	public static boolean isConnected(GraphUndirectedString g) throws QueueEmptyException {
//		time complexityO(v+e)
		VertexString v1=g.vertices.get(0);
		
		HashMap<VertexString,Boolean> visited=new HashMap<>();
		visited.put(v1,true);
		
		QueueUsingLL<VertexString> pending =new QueueUsingLL<>();
		pending.enqueue(v1);
		
		while(!pending.isEmpty())
		{
			VertexString current= pending.dequeue(); 
			
			ArrayList<VertexString> allAdj=current.getAdjacent();
			for(VertexString adj:allAdj)
			{
				if(!visited.containsKey(adj))
				{
					pending.enqueue(adj);
					visited.put(adj, true);
				}
			}
		}
		
		return g.vertices.size()==visited.size();
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		
		GraphUndirectedString g=new GraphUndirectedString();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
//		g.addVertex("P");
//		g.addVertex("Q");
//		g.addEdge("P", "Q");
		g.addEdge("A", "B");
		g.addEdge("A", "E");
		g.addEdge("A", "D");
		g.addEdge("B","C");
		g.addEdge("C","D");
		g.addEdge("C","F");
		g.addEdge("F","E");
		System.out.println(isConnected(g));
	}

	
}
