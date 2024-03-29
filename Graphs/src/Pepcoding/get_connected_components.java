package Pepcoding;

import java.util.*;
import java.io.*;

public class get_connected_components {

	   static class Edge {
		      int src;
		      int nbr;
		      int wt;

		      Edge(int src, int nbr, int wt) {
		         this.src = src;
		         this.nbr = nbr;
		         this.wt = wt;
		      }
		   }

		   public static void main(String[] args) throws Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		      int vtces = Integer.parseInt(br.readLine());
		      ArrayList<Edge>[] graph = new ArrayList[vtces];
		      for (int i = 0; i < vtces; i++) {
		         graph[i] = new ArrayList<>();
		      }

		      int edges = Integer.parseInt(br.readLine());
		      for (int i = 0; i < edges; i++) {
		         String[] parts = br.readLine().split(" ");
		         int v1 = Integer.parseInt(parts[0]);
		         int v2 = Integer.parseInt(parts[1]);
		         int wt = Integer.parseInt(parts[2]);
		         graph[v1].add(new Edge(v1, v2, wt));
		         graph[v2].add(new Edge(v2, v1, wt));
		      }

		      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
		      
		      // write your code here
		      
		      boolean[] vis = new boolean[vtces];
		      for(int v=0; v<vtces; v++){
		          
		          if(vis[v] == false){
		              ArrayList<Integer> comp = new ArrayList<>();
		              drawTree(graph,v, comp, vis);
		              comps.add(comp);
		          }
		      }

		      System.out.println(comps);
		   }
		   
		   
		   public static void drawTree(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp, boolean[] vis){
		       vis[src] = true;
		       comp.add(src);
		       for(Edge e : graph[src]){
		           if(vis[e.nbr] == false){
		               drawTree(graph, e.nbr, comp, vis);
		           }
		       }
		   }
	
}
