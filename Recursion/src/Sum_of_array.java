
public class Sum_of_array {

	
	public int sum(int arr[]) {
		
		return sum(arr, 0);
				
	}
	
	
	public int sum(int arr[], int si) {
		
		if(si == arr.length-1) {
			return arr[si];
		}
		
		return arr[si] + sum(arr, si+1);
	}
		
}
