package Easy;
import java.util.Stack;

public class Just_greater_element_on_right {

public static void main(String[] args) {
	
	int arr[] = {4,5,2,25};
	int n = arr.length;
	
	next_greater(arr,n);	
	
	}

public static void next_greater(int arr[] , int n) {
		
		Stack<Integer> s = new Stack<>();
	
		//resultant array for storing all the answer values
		
		int arr1[] = new int[n];
		
		for(int i = n-1 ; i>=0; i--) {
			while(!s.isEmpty() && (s.peek() <= arr[i])) {
				s.pop();
			}
			if(s.empty()) {
				arr1[i] = -1;
			}else {
				arr1[i] = s.peek();
			}
			
			s.push(arr[i]);
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}