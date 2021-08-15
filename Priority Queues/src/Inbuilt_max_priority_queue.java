import java.util.*;
public class Inbuilt_max_priority_queue {
	
	public static void main(String[] args) {
				
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int arr[] = {9,1,0,4,7,3};
		
		for(int i=0; i<arr.length; i++) {
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove() + " ");
		}
	}

}
