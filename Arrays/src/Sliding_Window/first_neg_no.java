package Sliding_Window;

import java.util.*;

public class first_neg_no {

	public static void main(String[] args) {
		int arr[] = {12,-1,-7,8,-15,30,13,28};
		int k = 3; //window size
			
		int i=0, j=0; //start and end
		
		ArrayList<Integer> al = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		
		while(j < arr.length) {
			if(arr[j] < 0) {
				q.add(arr[j]);
			}
			
			if(j-i+1 < k) {
				j++;
			}
			else if(j-i+1 == k) {
				if(q.isEmpty()) {
					al.add(0);
				}
				else{
					al.add(q.element());
				}
				
				if(al.get(i) < 0) {
					q.remove();
				}
//				else {
//					al.add(q.element());
//					q.remove();
//				}
				i++;
				j++;
			}
		}
		
		for(int x: al) {
			System.out.println(x);
		}
	}

}
