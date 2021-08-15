import java.util.PriorityQueue;

public class K_largest_elements {
	
	public static void main(String[] args) {
		int arr[] = {2,15,8,9,12,12,20};
		int k = 3;
		printKLargest(arr, k);
	}

	public static void printKLargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int i = 0;
				
		for( ; i<k; i++) {
			pq.add(arr[i]);
		}
		for( ; i<arr.length; i++) {
			int min = pq.element();
			if(arr[i] > min) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove() + " ");
		}
	}
	
	
}
