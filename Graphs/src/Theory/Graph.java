package Theory;

//by riya bansal unacademy lecture

import java.util.HashMap;
import java.util.ArrayList;

public class Graph {
	
	private class Vertex{
		//Neighbors
		HashMap<String, Integer> ngbrs = new HashMap<>();
	}
	
	private HashMap<String, Vertex> vertices = new HashMap<>();
	
	public int numVertex() {
		return vertices.size();
	}
	
	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		vertices.put(vname, vtx);
	}
	
	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vtx1 = vertices.get(vname1);
		Vertex vtx2 = vertices.get(vname2);

		
		//if one of the nodes are null or if nodes are already connected
		if(vtx1 == null || vtx2 == null || vtx1.ngbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.ngbrs.put(vname2,  cost);
		vtx2.ngbrs.put(vname1,  cost);
	}
	
	public void display() {
		System.out.println("-----------");
		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		
		for(String key:keys) {
			Vertex vtx = vertices.get(key);
			
			String str = key + " -> " + vtx.ngbrs;
			System.out.println(str);
		}
	}
}
