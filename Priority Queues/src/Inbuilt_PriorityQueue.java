import java.util.PriorityQueue;

public class Inbuilt_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int arr[] = {9,8,7,6,5,4,3,2,1};
		
		for(int i=0; i<arr.length; i++) {
			pq.add(arr[i]);
		}
		
		//System.out.println(pq.element());
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove() + " ");
		}

	}

}
