
public class Duplicate_in_array {

	public static void main(String[] args) {
		int arr[] = {2,1,0,4,3,1};
		System.out.println(duplicates(arr));
	}
	public static int duplicates(int[] arr) {
		
		int n = arr.length;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum - (n-2)*(n-1)/2 ;
	}

}
