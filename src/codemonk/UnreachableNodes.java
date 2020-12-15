package codemonk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;




public class UnreachableNodes {

	
	public static boolean havePathDFS(Graph g,int a,int b) 
	{
		if(!(g.isVertexPresent(a))||!(g.isVertexPresent(b)))
			return false;
		
		Vertex v1=g.getVertex(a);
		Vertex v2=g.getVertex(b);
		
		HashMap<Vertex,Boolean> visited=new HashMap<>();
		visited.put(v1, true);
		return havePathDFS(g,v1,v2,visited);
	}
	
	public static boolean havePathDFS(Graph g,Vertex v1,Vertex v2,HashMap<Vertex,Boolean> visited) {
	
		if(v1.isAdjacent(v2))
			return true;
		
		ArrayList<Vertex> allAdj=new ArrayList<>();
		allAdj=v1.getAdjacent();
		for(Vertex adj:allAdj)
		{
			if(!visited.containsKey(adj))
			{
				visited.put(adj, true);
				if (havePathDFS(g,adj, v2, visited))
					return true;
			
			}
		}
		return false;
	}
	
	public static int unreachable_nodes(Graph g, int headV) {
		
		int count=0;
		for(int i=1;i<=g.vertices.size();i++)
		{
			if(!havePathDFS(g,headV,i))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		
		Graph g=new Graph();
		
		for(int i=1;i<=n;i++)
			g.addVertex(i);
		
		for(int i=1;i<=m;i++)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			g.addEdge(a, b);
		}
		
	int headV=s.nextInt();
		
		int count=unreachable_nodes(g,headV);
		System.out.println(count);
	}

	
}
