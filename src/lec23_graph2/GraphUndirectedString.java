package lec23_graph2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import lec15_stacksNqueues.QueueEmptyException;
import lec15_stacksNqueues.QueueUsingLL;


public class GraphUndirectedString {

	ArrayList<VertexString> vertices;
	
	GraphUndirectedString(){
		vertices = new ArrayList<>();
	}
	
	public void print(){
		for(VertexString v : vertices){
			v.print();
		}
	}
	
	public void addVertex(String name){
		if(isVertexPresent(name)){
			return;
		}
		
		VertexString v = new VertexString(name);
		vertices.add(v);
	}

	public void addEdge(String name1, String name2 ){
		if( !isVertexPresent(name1) || !isVertexPresent(name2)){
			return;
		}
		if(areAdjacent(name1, name2)){
			return;
		}
		
		VertexString first = getVertex(name1);
		VertexString second = getVertex(name2);
		EdgeString e = new EdgeString(first, second);
		first.addEdge(e);
		second.addEdge(e);
	}
		
	public  boolean areAdjacent(String name1, String name2) {
		VertexString v1 = getVertex(name1);
		VertexString v2 = getVertex(name2);
		
		if(v1 == null || v2== null){
			return false;
		}
		
		return v1.isAdjacent(v2);
		
	}

	public void removeVertex(String name){
		
		VertexString v = getVertex(name);
		if(v == null){
			return;
		}
		ArrayList<VertexString> adjacentVertices = v.getAdjacent();
		for(VertexString adj : adjacentVertices){
			adj.removeEdgeWith(v);
		}
		vertices.remove(v);
	}

	public void removeEdge(String name1, String name2){
		VertexString v1 = getVertex(name1);
		VertexString v2 = getVertex(name2);
		if(v1 == null || v2== null){
			return ;
		}
		if(!areAdjacent(name1, name2)){
			return;
		}
		
		v1.removeEdgeWith(v2);
		v2.removeEdgeWith(v1);
		
	}
	
	public VertexString getVertex(String name) {
		for(VertexString v : vertices){
			if(v.name.equals(name)){
				return v;
			}
		}
		return null;
	}

	public boolean isVertexPresent(String name) {
		for(VertexString v : vertices){
			if(v.name.equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public boolean isEdgePresent(String name1,String name2) {
		
		VertexString v1=getVertex(name1);
		VertexString v2=getVertex(name2);
		
		if(v1==null||v2==null)
			return false;
		
		return v1.isAdjacent(v2);
	}
	
	public int countVertices(){
		return vertices.size();
	}

	public int countEdges()
	{
		int count=0;
		for(VertexString v:vertices)
		{
			count+=v.edges.size();
		}
		
		return count;
	}
	
	public boolean havePathDFS(String a,String b) throws QueueEmptyException{
		if(!(isVertexPresent(a))||!(isVertexPresent(b)))
			return false;
		
		VertexString v1=getVertex(a);
		VertexString v2=getVertex(b);
		HashMap<VertexString,Boolean> visited=new HashMap<>();
		visited.put(v1, true);
		return havePathDFS(v1,v2,visited);
	}
	
	public boolean havePathDFS(VertexString v1,VertexString v2,HashMap<VertexString,Boolean> visited) {
//		 time complexity(vertex+edges )

		if(v1.isAdjacent(v2))
			return true;
		
		ArrayList<VertexString> allAdj=v1.getAdjacent();
		
		for(VertexString adj:allAdj)
		{
			if(!visited.containsKey(adj))
			{
				visited.put(adj, true);
				if (havePathDFS(adj, v2, visited))
					return true;
			
			}
		}
		return false;
	}
		
	public boolean havePathBFS(String a,String b) throws QueueEmptyException
	{
		if(!(isVertexPresent(a))||!(isVertexPresent(b)))
			return false;
		
		VertexString v1=getVertex(a);
		VertexString v2=getVertex(b);
		return havePathBFS(v1,v2);
	
	}
		
	public boolean havePathBFS(VertexString v1, VertexString v2) throws QueueEmptyException {
//	 time complexity(vertex+edges )
		HashMap<VertexString,Boolean> visited=new HashMap<>();
		visited.put(v1,true);
		QueueUsingLL<VertexString> pending =new QueueUsingLL<>();
		pending.enqueue(v1);
		while(!pending.isEmpty())
		{
			VertexString current= pending.dequeue(); 
			if(current.isAdjacent(v2))
				return true;
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
		return false;		
	}

}
