
public class max_and_min_element {
	static int getMin(int arr[], int n) {
		int min = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	static int getMax(int arr[], int n) {
		int max = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
    public static void main (String[] args)
    {
        int arr[] = { 12, 1234, 45, 67, 1 };
        int n = arr.length;
        System.out.println( "Minimum element"
           + " of array: " + getMin(arr, n));
        System.out.println( "Maximum element"
           + " of array: " + getMax(arr, n));
    }
}
