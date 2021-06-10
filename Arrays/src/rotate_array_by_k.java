import java.util.Scanner;

public class rotate_array_by_k {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println("Enter the value of k: ");
		int k = sc.nextInt();

		rotate(arr, k);
		
	}
	
	public static void rotate(int[] arr, int k) {
		
		k = k % arr.length;
		
		if(k < 0) {
			k = k + arr.length;      //k = -1 will be same as for k = 6
		}
		
		//part 1
		reverse(arr, 0, arr.length-k-1);
		
		//part 2
		reverse(arr, arr.length-k, arr.length-1);
		
		
	}
	
	 public static void reverse(int[] arr, int i, int j) {
		 int li = i;
		 int ri = j;
		 
		 while(li < ri) {
			 int temp = arr[li];
			 arr[li] = arr[ri];
			 arr[ri] = temp;
		 }
		 
		 li++;
		 ri--;
	 }

}
