package lec23_graph2;

import java.util.HashMap;
import java.util.Iterator;

import lec15_stacksNqueues.QueueEmptyException;

public class GraphUse {

	public static void main(String[] args) throws QueueEmptyException {

		GraphUndirectedString g = new GraphUndirectedString();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		g.addVertex("H");
		g.addVertex("P");
		g.addVertex("Q");
		g.addVertex("R");
		
		g.addEdge("A","B");
		g.addEdge("A","C");
		g.addEdge("A","D");
		g.addEdge("C","E");
		g.addEdge("E","F");
		g.addEdge("E","G");
		g.addEdge("G","H");
		g.addEdge("P","R");
		g.addEdge("P","Q");
//		g.addEdge("R","Q");
		
//		g.print();
//		System.out.println(g.countVertices());
//		System.out.println(g.countEdges());
//
//		System.out.println();
//		g.removeVertex("C");
//		g.print();
//		
//		System.out.println(g.countVertices());
//		System.out.println(g.countEdges());
//
//	System.out.println(g.isVertexPresent("F"));
		System.out.println(g.havePathDFS("A","P"));
		System.out.println(g.havePathBFS("A","F"));
		System.out.println(g.havePathDFS("B","H"));
		System.out.println(g.havePathDFS("P","Q"));

	}

	
	
	

}
