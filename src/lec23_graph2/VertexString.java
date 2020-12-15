package lec23_graph2;

import java.util.ArrayList;

public class VertexString {

	String name;
	ArrayList<EdgeString> edges;
	
	VertexString(String name){
		this.name = name;
		edges = new ArrayList<>();
	}

	public void addEdge(EdgeString e) {
		edges.add(e);
	}

	public boolean isAdjacent(VertexString v2) {
	
		for(EdgeString e : edges){
			if(e.first == v2 || e.second == v2){
				return true;
			}
		}	
		return false ;
	}

	public void removeEdgeWith(VertexString v2) {
		for(int i = 0; i < edges.size(); i++){
			EdgeString currentEdge = edges.get(i);
			if(currentEdge.first == v2 || currentEdge.second == v2){
				edges.remove(i);
				break;
			}
		}
		
	}

	public ArrayList<VertexString> getAdjacent() {
		ArrayList<VertexString> adjacentVertices = new ArrayList<>();
		for(EdgeString e : edges){
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
		String toBePrinted = this.name +" : ";
		for(EdgeString e : edges){
			if(e.first == this){
				toBePrinted += e.second.name +", ";
			}
			else{
				toBePrinted += e.first.name +", ";
			}
		}
		System.out.println(toBePrinted);
	}
	
}
