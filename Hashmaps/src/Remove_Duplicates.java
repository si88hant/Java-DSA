import java.util.ArrayList;
import java.util.HashMap;

public class Remove_Duplicates {

	public static ArrayList<Integer> removeDuplicates(int arr[]){
		ArrayList<Integer> output = new ArrayList<Integer>();
		HashMap<Integer,Boolean> seen = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			if(seen.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			seen.put(arr[i], true);
		}
		
		return output;
		
	}
	
	public static void main(String [] args) {
		int arr[] = {1,2,3,1,2,3,4,7,6,6,8,8,8,8,9,8,8,2,1,2,4,10};
		ArrayList<Integer> output = removeDuplicates(arr);
		for(int i=0; i<output.size(); i++) {
			System.out.print(output.get(i)+" ");
		}
	}
	
}
