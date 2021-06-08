
public class reverse {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		printReverse(arr,0);

	}

	
	//display reversed recursively
	public static void printReverse(int arr[], int si) { 
		if(si==arr.length) {
			return;
		}
		printReverse(arr, si+1);
		System.out.println(arr[si]);
	}
}
