package Striver_Graph_Series;

import java.util.*;
import java.lang.*;
import java.io.*;


class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second; 
    }
}


public class detect_cycle_in_undirected_graph_BFS {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[] = new boolean[V];
        Arrays.fill(vis,false);
        
        int parent[] = new int[V];
        Arrays.fill(parent,-1);  
        
        for(int i=1;i<=V;i++)
            if(vis[i]==false) 
                if(checkForCycle(adj, i,vis, parent)) 
                    return true;
    
        return false;
    }
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[], int parent[])
    {
       Queue<Node> q =  new LinkedList<>(); //BFS
       q.add(new Node(s, -1));  //starting node = s, it's parent = -1(no parent)
       vis[s] =true;
       
       while(!q.isEmpty())
       {
           int node = q.peek().first;
           int par = q.peek().second;  //node's parent
           q.remove(); 
           
           for(Integer it: adj.get(node))
           {
               if(vis[it]==false)  //i.e. if node has not been traversed before
               {
                   q.add(new Node(it, node));
                   vis[it] = true; 
               }
        
               else if(par != it) return true; //now it means that the parent has already been visited so that is only possible in case of cycle
           }
       }
       
       return false;
    }
    
	
}
