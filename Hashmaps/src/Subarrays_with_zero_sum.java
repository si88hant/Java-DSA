import java.util.HashMap;

public class Subarrays_with_zero_sum {
	
	//CB
	
	public static void main(String[] args) {
		int arr[] = {3,-5,-8,9,-1};
		System.out.println(subArrayZero(arr));
	}
	
	public static boolean subArrayZero(int arr[]) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		int prefix_sum = 0;
		for(int i=0; i<arr.length; i++) {
			prefix_sum = prefix_sum + arr[i];
			
			if(prefix_sum == 0 || map.containsKey(prefix_sum)) {
				return true;
			}
			else {
				map.put(prefix_sum, true);
			}
		}
		
		return false;
	}

}
