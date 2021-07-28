
public class Find_the_unique_element {

	public static void main(String[] args) {
		int arr[] = {6,1,6,3,4,3,1};
		System.out.println(findUnique(arr));
	}
	
	public static int findUnique(int[] arr) {
		
		// x^x = 0
		// x^0 = x
		
		int unique = 0;
		for(int i=0; i<arr.length; i++) {
			unique = unique^arr[i];
		}
		return unique;
	}

}
