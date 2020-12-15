package lec23_graph2;

import java.util.ArrayList;
import java.util.HashMap;

import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.QueueUsingLL;

public class printAllConnected {

	public static void printAllConnectedBFS(GraphUndirectedString g) throws QueueEmptyException
	{
		HashMap<VertexString,Boolean> visited = new HashMap<>();
		
		for(int i=0;i<g.vertices.size();i++)
		{
			if(!visited.containsKey(g.vertices.get(i)))
			{
				visited.put(g.vertices.get(i),true);
				QueueUsingLL<VertexString> pending=new QueueUsingLL<>();
				pending.enqueue(g.vertices.get(i));
				while(!pending.isEmpty())
				{
					VertexString current=pending.dequeue();
					System.out.print(current.name+" ");
					ArrayList<VertexString> allAdj=current.getAdjacent();
					for(VertexString v:allAdj)
					{
						if(!visited.containsKey(v))
						{
							pending.enqueue(v);
							visited.put(v, true);
							i++;
						}
					}
				}
				System.out.println();
			}
				
		}
		
	}
	
	public static void printAllConnectedDFS(GraphUndirectedString g){
		
		HashMap<VertexString,Boolean> visited =new HashMap<VertexString, Boolean>();
		for(int i=0;i<g.vertices.size();i++)
		{
			
			VertexString v=g.vertices.get(i);
//			System.out.println(v.name);
			visited=printDFS(g, v, visited)	;
			System.out.println();
		}
		
		
	}
	
	public static HashMap<VertexString, Boolean> printDFS(GraphUndirectedString g, VertexString v,HashMap<VertexString, Boolean>visited){
		
		if(!visited.containsKey(v))
		{
			System.out.print(v.name+" ");
			
			visited.put(v, true);
			ArrayList<VertexString> allAdj=new ArrayList<>();
			allAdj=v.getAdjacent();
			for(VertexString adj:allAdj)
			{
				if(!visited.containsKey(adj))
				{
//					visited.put(adj, true);
					printDFS(g, adj, visited);
//					System.out.println(adj.name);
				}
			}
			
		}
		
		return visited;
	}
//	 Both Dfs and Bfs have time complexity O(vertex+edges)
	public static void main(String[] args) throws QueueEmptyException {
		GraphUndirectedString g= new GraphUndirectedString();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		g.addVertex("H");
		g.addVertex("I");
		g.addVertex("J");
		g.addVertex("K");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("A", "D");
		g.addEdge("B","E");
		g.addEdge("F","D");
		g.addEdge("C","F");
		g.addEdge("F","E");
		g.addEdge("G","H");
		g.addEdge("I","J");
		g.addEdge("I","K");
		g.addEdge("J","K");
//		printAllConnectedBFS(g);
		printAllConnectedDFS(g);
	}
}
