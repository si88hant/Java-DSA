import java.util.Arrays;

public class kth_smallest_element {

	public static void main(String[] args) {
		
		int arr[] = {36,29,822,552,89,12,36,783,15,79};
		Arrays.sort(arr);
		
		int k = 2;
		
		System.out.println("kth smallest element is: " + arr[k-1]);
	}

}
