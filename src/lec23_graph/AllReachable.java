package lec23_graph;


	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.LinkedList;
	import java.util.Queue; 
	import java.util.Scanner; 
	
	public class AllReachable {
// http://www.geeksforgeeks.org/find-all-reachable-nodes-from-every-node-present-in-a-given-set/ 

/* in this program we will first add all the vertices to the map 
     with their component number as value using BFS O(V+E)
 *  then for the given array we will find each vertex's compo number and find 
     all vertices with same component number in the map O(n*V)
 * total time complexity is O(V+E)+O(n*V)
 */
		
	private static void printallReachable(GraphUndirectedInteger g, int[] a) {
		int component=0; 
		HashMap<Vertex,Integer> visited=new HashMap<>();
		for(int i=0;i<g.vertices.size();i++) 
		{ 
			Vertex v=g.vertices.get(i); 
			if(!visited.containsKey(v))
			{
				component++;
				visited.put(v,component);
				Queue<Vertex> pending =new LinkedList<Vertex>(); 
				pending.add(v); 
				while(!pending.isEmpty()) 
				{ 
					Vertex curr=pending.remove(); 
//						System.out.println(curr.data);
//						System.out.println(component);
					ArrayList<Vertex> allAdj=curr.getAdjacent(); 
					for(Vertex adj:allAdj)
					{
						if(!visited.containsKey(adj)) 
						{
							visited.put(adj, component);
							pending.add(adj);
						} 
					}
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
		
			Vertex v=g.getVertex(a[i]);
			int curr_comp=visited.get(v);
			for(Vertex vv : visited.keySet())
			{
				if(visited.get(vv)==curr_comp)
					System.out.print(vv.data+" ");
				
			}
			System.out.println();
		}

	}
		
	public static void main(String[] args) { 
			
		Scanner s=new Scanner(System.in); 
		
		int []a={1,7,2,6}; 
		GraphUndirectedInteger g=new GraphUndirectedInteger();
		g.addVertex(1); 
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addVertex(5);
		g.addVertex(6);
		g.addVertex(7);
		g.addEdge(1,2);
		g.addEdge(1,3); 
		g.addEdge(3,4);
		g.addEdge(4,2);
		g.addEdge(5,6);
		g.addEdge(6,7);
		g.addEdge(5,7); 
		printallReachable(g,a); 
	}
	
}
