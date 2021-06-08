public class sort012 {

	public static void main(String[] args) {
		int arr[] = {1,0,2,1,0,1,0,1,0,2,0,2,0,1,0,2,0,2,1,1,0,1,1};
		
		int i = 0;
		int j = arr.length-1;
		
  		while(i<=j) {
			if(arr[i] == 0) {
				i++;
			}
			if(arr[j] == 2) {
				j--;
			}
			if(arr[i] == 2 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
