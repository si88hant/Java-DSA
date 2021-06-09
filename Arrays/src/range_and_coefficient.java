
public class range_and_coefficient {

	public static void main(String[] args) {
		
		int arr[] = {15,15,10,9,6,7,17};
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		for(int j=0; j<arr.length; j++) {
			if(arr[j] < min) {
				min = arr[j];
			}
		}

		float range = max - min;
		float coeff = range/(max+min);
		
		System.out.println("Range: " + range);
		System.out.println("Coefficient: "+ coeff);
		
		
	}

}
