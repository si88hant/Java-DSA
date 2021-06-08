
public class reverse {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		System.out.println("Display reversed array recursively ");
		printReverse(arr,0);
		int rev_arr[] = reverse(arr);
		System.out.println();
		System.out.println("Reversed array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(rev_arr[i] + " ");
		}
	}

	
	//display reversed recursively
	public static void printReverse(int arr[], int si) {
		if(si==arr.length) {
			return;
		}
		printReverse(arr, si+1);
		System.out.println(arr[si]);
	}
	
	//reverse an array by storing it in a new array
	public static int[] reverse(int arr[]) {
		int b[] = new int[arr.length];
		
		int j = 0;
		for(int i=arr.length-1; i>=0; i--) {
			b[j] = arr[i];
			j++;
		}
		return b;
	}
}
