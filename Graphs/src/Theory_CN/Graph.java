package Theory_CN;

import java.util.Scanner;

public class Graph {

	public static void main(String[] args) {
		int n;
		int e;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();    // n=vertices
		e = s.nextInt();    // e=edges
		
		int edges[][] = new int[n][n];  //if we have n 'vertices', then we'll create a n*n 2D array
		
		for(int i=0; i<e; i++) {
			
			int fv = s.nextInt();   //fv = first vertex
			int sv = s.nextInt();   //sv = second vertex
			
			edges[fv][sv] = 1;   //agar 1st vertex se 2nd vertex ke beech mai 'edge' hogi 
			edges[sv][fv] = 1;   //then second vertex se first vertex ke beech mai bhi edge hogi
			                     //because this is a un-directional graph
		}
		print(edges);
	}
	
	public static void printHelper(int edges[][], int sv, boolean visited[]) {  //sv = starting vertex
		System.out.println(sv);
		visited[sv] = true;
		
		int n = edges.length;
		for(int i=0; i<n; i++) {
			if(edges[sv][i] == 1 && !visited[i]) {
				printHelper(edges, i, visited);
			}
		}
	}
	
	public static void print(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for(int i=0; i<edges.length; i++) {
			if(!visited[i]) {
				printHelper(edges, i, visited);
			}
		}
	}

}

 