import java.util.Arrays;

public class move_negative_nos_to_one_side {

	public static void main(String[] args) {
			
		int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6,11,-5,32,-69,-98,-22,58,96,-9,-35};
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			if(arr[start] < 0) {
				start++;
			}
			if(arr[end] > 0) {
				end--;
			}
			
			if(arr[start] > 0 && arr[end] < 0) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				
				start++;
				end--;
			}
		}
		
	//	Arrays.sort(arr);  //just in case you want sorted elements
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
