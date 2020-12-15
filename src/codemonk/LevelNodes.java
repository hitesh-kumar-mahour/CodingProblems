package codemonk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



class Edge {

	Vertex first;
	Vertex second;
	
	Edge(Vertex first, Vertex second){
		this.first = first;
		this.second = second;
	}
}


class Vertex {

	int data;
	ArrayList<Edge> edges;
	
	Vertex(int data){
		this.data = data;
		edges = new ArrayList<>();
	}

	public void addEdge(Edge e) {
		edges.add(e);
	}

	public boolean isAdjacent(Vertex v2) {
	
		for(Edge e : edges){
			if(e.first == v2 || e.second == v2){
				return true;
			}
		}	
		return false ;
	}

	public void removeEdgeWith(Vertex v2) {
		for(int i = 0; i < edges.size(); i++){
			Edge currentEdge = edges.get(i);
			if(currentEdge.first == v2 || currentEdge.second == v2){
				edges.remove(i);
				break;
			}
		}
		
	}

	public ArrayList<Vertex> getAdjacent() {
		ArrayList<Vertex> adjacentVertices = new ArrayList<>();
		for(Edge e : edges){
			if(e.first == this){
				adjacentVertices.add(e.second);
			}
			else{
				adjacentVertices.add(e.first);
			}
		}
		return adjacentVertices;
	}

	public void print() {
		String toBePrinted = this.data +" : ";
		for(Edge e : edges){
			if(e.first == this){
				toBePrinted += e.second.data +", ";
			}
			else{
				toBePrinted += e.first.data +", ";
			}
		}
		System.out.println(toBePrinted);
	}
	
}


class Graph {

	ArrayList<Vertex> vertices;
	
	Graph(){
		vertices = new ArrayList<>();
	}
	
	public void print(){
		for(Vertex v : vertices){
			v.print();
		}
	}
	
	public void addVertex(int data){
		if(isVertexPresent(data)){
			return;
		}
		
		Vertex v = new Vertex(data);
		vertices.add(v);
	}

	public void addEdge(int name1, int name2 ){
		if( !isVertexPresent(name1) || !isVertexPresent(name2)){
			return;
		}
		if(areAdjacent(name1, name2)){
			return;
		}
		
		Vertex first = getVertex(name1);
		Vertex second = getVertex(name2);
		Edge e = new Edge(first, second);
		first.addEdge(e);
		second.addEdge(e);
	}
	
	public  boolean areAdjacent(int name1, int name2) {
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		
		if(v1 == null || v2== null){
			return false;
		}
		
		return v1.isAdjacent(v2);
		
	}

	public void removeVertex(int data){
		
		Vertex v = getVertex(data);
		if(v == null){
			return;
		}
		ArrayList<Vertex> adjacentVertices = v.getAdjacent();
		for(Vertex adj : adjacentVertices){
			adj.removeEdgeWith(v);
		}
		vertices.remove(v);
	}

	public void removeEdge(int name1, int name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		if(v1 == null || v2== null){
			return ;
		}
		if(!areAdjacent(name1, name2)){
			return;
		}
		
		v1.removeEdgeWith(v2);
		v2.removeEdgeWith(v1);
		
	}
	
	public Vertex getVertex(int data) {
		for(Vertex v : vertices){
			if(v.data==data){
				return v;
			}
		}
		return null;
	}

	public boolean isVertexPresent(int data) {
		for(Vertex v : vertices){
			if(v.data==data){
				return true;
			}
		}
		return false;
	}
	
	public int countVertices()
	{
		return vertices.size();
	}

	public int countEdges()
	{
		int count=0;
		for(Vertex v:vertices)
		{
			count+=v.edges.size();
		}
		
		return count;
	}

}
public class LevelNodes {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		Graph g=new Graph();
		
		for(int i=1;i<=n;i++)
		{
			g.addVertex(i);
		}
		
		for(int i=1;i<=n-1;i++)
		{
			int n1=s.nextInt();
			int n2=s.nextInt();
			g.addEdge(n1, n2);
		}
		
		int level=s.nextInt();
		System.out.println(nodes_at_level(level,g));
	}

/*	16
	1 2
	1 3
	1 4
	2 5
	2 6
	3 7
	3 8
	3 9
	4 10
	6 11
	6 12
	12 13 
	12 14
	12 15
	12 16
	3
	*/
	
	
	public static int nodes_at_level(int level,Graph g) {
		Vertex v1=g.getVertex(1);
		Queue<Vertex> pending=new LinkedList<Vertex>();
		HashMap<Vertex, Boolean> visited=new HashMap<>();
		visited.put(v1,true);
		pending.add(v1);
		pending.add(null);
		
		int currlevel=1;
		
		while(!pending.isEmpty())
		{

			if(currlevel==level)
				return pending.size()-1;
			
			Vertex currVertex=pending.remove();
			
			
			if(currVertex==null)
			{
				currlevel++;
				pending.add(null);
				
			}
			else
			{
			
				ArrayList<Vertex> allAdj=currVertex.getAdjacent();
			
				for(Vertex adj:allAdj)
				{
					if(!visited.containsKey(adj))
					{
						pending.add(adj);
						visited.put(adj, true);
					}
				}
			}
		}
		return 0;
	}
}


