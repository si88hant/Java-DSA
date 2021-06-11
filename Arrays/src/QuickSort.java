
public class QuickSort {

	public static void main(String[] args) {
		
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		int n = arr.length;
		
		quickSort(arr, 0, n-1);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void quickSort(int arr[], int lo, int hi) {
		
		if(lo >= hi) {
			return;
		}
		
		//partitioning step
		int mid = (lo+hi)/2;
		int pivot = arr[mid];
		
		int left = lo;
		int right = hi;
		
		while(left <= right) {
			while(arr[left] < pivot) {
				left++;
			}
			while(arr[right] > pivot) {
				right--;
			}
			
			if(left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left++;
				right--;
			}
			
		}
		
		//sort both halves
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
	}	
}
