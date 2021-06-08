public class sort012 {

	public static void main(String[] args) {
		int arr[] = {1,0,2,1,0,1,0,1,0,2,0,2,0,1,0,2,0,2,1,1,0,1,1};
		
		int start = 0;
		int end = arr.length-1;
		int i=0;
		
  		while(i<=end && start<end) {
			if(arr[i] == 0) {
				arr[i] = arr[start];
				arr[start] = 0;
				start++;
				i++;
			}
			else if(arr[i] == 2) {
				arr[i] = arr[end];
				arr[end] = 2;
				end--;
			}
			else {
				i++;
			}
		}
		
		
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
