
public class union_of_two_sorted_arrays {

	public static void main(String[] args) {
		
		int arr1[] = {1,3,4,5,7};
		int arr2[] = {2,3,5,6};
	
		int m = arr1.length;
		int n = arr2.length;
		printUnion(arr1, arr2, m, n);

	}
	
	public static void printUnion(int arr1[], int arr2[], int m, int n) {
		
		int i = 0, j=0;
		
		while(i<m && j<n) {
			
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			}
			else if(arr2[j] < arr1[i]) {
				System.out.print(arr2[j] + " ");
				j++;
			}
			else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}
		}
		
		//now print rest of the elements
		
		while(i < m) {
			System.out.print(arr1[i] + " ");
			i++;
		}
		
		while(j < n) {
			System.out.print(arr2[j] + " ");
			j++;
		}
	}

}
