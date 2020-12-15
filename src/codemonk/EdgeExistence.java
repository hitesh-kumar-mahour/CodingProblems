package codemonk;


import java.util.ArrayList;
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

public class EdgeExistence {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		Graph g=new Graph();
		
		for(int i=0;i<m;i++)
		{
			int v1=s.nextInt(),v2=s.nextInt();
			g.addVertex(v1);
			g.addVertex(v2);
			g.addEdge(v1, v2);
		}
		
		int q=s.nextInt();
		for(int i=0;i<q;i++)
		{
			int v1=s.nextInt();
			int v2=s.nextInt();
			if(g.areAdjacent(v1,v2))
				System.out.println("Yes");
			else System.out.println("No");
			
		}
//		g.print();
	}
	
	
}
