package Striver_Graph_Series;

import java.util.*;

public class shortest_dist_in_undirected_graph {

	private void shortestPath(ArrayList<ArrayList<Integer>> adj,int N,int src) 
	{ 
		
		int[] dist = new int[N]; 
    	for(int i = 0; i < N; i++) 
    		dist[i] = 1000000000; 
    
    	Queue<Integer> q=new LinkedList<>();
    	
    	
    	dist[src] = 0;
    	q.add(src); 
    
    	while(q.isEmpty()==false) 
    	{ 
    		int node = q.poll();  
    		 
    		for(int it:adj.get(u)){
    		    if(dist[node] + 1 < dist[it]){
    		        dist[it] = dist[node] + 1;
    		        q.add(it);
    		    }
    		} 
    	}
    	
    	for(int i = 0;i < N;i++) {
    	    System.out.print(dist[i] + " "); 
    	}
	} 
	
	
}
