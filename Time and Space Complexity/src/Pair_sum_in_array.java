import java.util.Arrays;

public class Pair_sum_in_array {

	public static void main(String[] args) {
		int arr1[] = {2,2,2,2,2};
		int num = 4;
		System.out.println(pairSum(arr1, num));

	}
	public static int pairSum(int[] arr, int num) {
        
        Arrays.sort(arr);
        
        int total_pairs = 0;
        
        int i = 0, j=arr.length-1;
        
        while(i<j){
            if(arr[i] + arr[j] < num){
                i++;
            }
            else if(arr[i] + arr[j] > num){
                j--;
            }
            else {
            	int start = arr[i]; //element at start
            	int end = arr[j];  //element at end
            	
            	if(start == end) {
            		//see coding ninjas solution
            	}
            	
            }
        }
        return total_pairs;
	}

}
