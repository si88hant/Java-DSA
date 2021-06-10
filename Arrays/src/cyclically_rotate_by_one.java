
public class cyclically_rotate_by_one {

	//My method
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int x = arr[arr.length-1];
		
		int new_arr[] = new int[arr.length];
		
		new_arr[0] = x;
		
		int i=0;
		for(int j=1; j<new_arr.length; j++) {
			new_arr[j] = arr[i];
			i++;
			if(i == arr.length-1) {
				break;
			}
		}
		
		for(int k = 0; k<new_arr.length; k++) {
			System.out.print(new_arr[k] + " ");
		}
		
	}

}
