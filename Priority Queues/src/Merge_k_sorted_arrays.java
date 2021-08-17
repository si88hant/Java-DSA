import java.util.*;

public class Merge_k_sorted_arrays {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input){

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i=0; i<input.size(); i++) {
			ArrayList<Integer> temp = input.get(i);
			for(int j=0; j<temp.size(); j++) {
				pq.add(temp.get(j));
			}
		}
		
		while(!pq.isEmpty()) {
			ans.add(pq.remove());
		}
		return ans;
	}
}
