import java.util.Arrays;

public class kth_largest_element {

	public static void main(String[] args) {
		int arr[] = {36,29,822,552,89,12,36,783,15,79};
		Arrays.sort(arr);
		
		int k = 5;
		
		System.out.println(k+"th largest element is : " + arr[arr.length-k]);
	}

}
