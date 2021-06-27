package Easy;

import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        boolean[] vis = new boolean[V];
        trav(adj,a,0,vis);
        return a;
    }
    
    public void trav(ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> a , int s , boolean[] vis){

        if(vis[s] == true){
            return;
        }
        
        vis[s]=true;
        a.add(s);
        
        for(Integer i : adj.get(s)){

            if(vis[i] == false){

                trav(adj , a , i,vis);

            }

        }
    }
}
