package Aditya_Verma_recursion;

public class sort_an_array_using_recursion {

	public static void main(String[] args) {
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		
		sort(arr, arr.length);
		
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}

	private static void sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		if(n == 1) {
			return;
		}
		
		for(int i=0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		sort(arr, n-1);
		
	}

}
