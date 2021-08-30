package Striver_Graph_Series;

import java.util.ArrayList;

public class Bipartite_Graph_DFS {
	boolean dfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int color[]) {
		
		if(color[node] == -1) {
			color[node] = 1;
		}
		
		for(Integer it: adj.get(node)) {
			if(color[it] == -1) {
				color[it] = 1 - color[node]; 

				if(!dfsCheck(adj, it, color)) 
					return false; 
			}
			else if(color[it] == color[node]) {
				return false; 
			}
		}
		return true; 
	}


    boolean checkBipartite(ArrayList<ArrayList<Integer>> adj, int n)
    {
        int color[] = new int[n];
        for(int i = 0;i<n;i++) {
        	color[i] = -1; 
        }
        for(int i = 0;i<n;i++) {
        	if(color[i] == -1) {
        		if(!dfsCheck(adj, i, color)) {
        			return false; 
        		}
        	}
        }
        return true; 
    }
}
