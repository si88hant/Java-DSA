import java.util.*;
public class Running_median {

	public static void main(String[] args) {
		int arr[] = {6,2,1,3,7,5}; 
		findMedian(arr);

	}

	
	public static void findMedian(int arr[]) {
		ArrayList<Integer> al1 = new ArrayList<>();  //main arraylist
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int median = 0;
		
		//copy array to al1
		for(int i=0; i<arr.length; i++) {
			al1.add(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<=i; j++) {
				pq.add(arr[j]);
			}
			
			ArrayList<Integer> al2 = new ArrayList<>();  //for calculating medians
			while(!pq.isEmpty()) {
				al2.add(pq.remove());
			}

			int middle = al2.size()/2;
			if(al2.size() % 2 == 0) {
				int medianA = al2.get(middle);
				int medianB = al2.get(middle - 1);  
				median = (medianA + medianB)/2;
			}
			else {
				 median = al2.get(middle);
			}
			
			al1.set(i, median);
		}
		
		for(int i=0; i<al1.size(); i++) {
			System.out.print(al1.get(i) + " ");
		}
	}
}
