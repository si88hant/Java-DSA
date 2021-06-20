package Theory;

// by riya bansal unacademy lecture

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Graph graph = new Graph();
		
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B", 1);
		graph.addEdge("A", "D", 10);
		graph.addEdge("B", "C", 2);
		graph.addEdge("C", "D", 3);
		graph.addEdge("D", "E", 4);
		graph.addEdge("E", "F", 5);
		graph.addEdge("E", "G", 12);
		graph.addEdge("F", "G", 4);
		
		graph.display();
	}

}
