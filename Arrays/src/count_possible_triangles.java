import java.util.Arrays;

public class count_possible_triangles {

	public static void main(String[] args) {
		
//		int arr[] = {6, 4, 9, 7, 8};
//		int arr[] = {4, 6, 3, 7};
		int arr[] = {10, 21, 22, 100, 101, 200, 300};
		
		int n = arr.length;
		
		Arrays.sort(arr);
		
		int count = 0;
		for(int i=n-1; i>=2; i--) {
			int l = 0;
			int r = i-1;
			
			while(l<r) {
				if(arr[l] + arr[r] > arr[i]) {
					count = count + r-l;
					r--;
				}
				else {
					l++;
				}
			}
		}
		System.out.println(count);
	}

}
