
public class Check_max_heap {

	public static void main(String[] args) {
		int arr1[] = {42, 20, 18, 6, 14, 11, 9, 4};
		
		int tc1[] = {5, 4, 3, 2, 1};
		int tc2[] = {1, 32, 8, 92, 94, 3, 9};
		int tc3[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 7};
		
		
		boolean ans = checkMaxHeap(arr1);
		boolean anstc1 = checkMaxHeap(tc1);
		boolean anstc2 = checkMaxHeap(tc2);
		boolean anstc3 = checkMaxHeap(tc3);
		
		System.out.println("arr1: " + ans);
		System.out.println("tc1: " + anstc1);
		System.out.println("tc2: " + anstc2);
		System.out.println("tc3: " + anstc3);

	}
	public static boolean checkMaxHeap(int arr[]) {   
        int count = 0;
        if(arr[0] > arr[1]){
            count++;
        }
        
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] < arr[(i-1)/2]){
                count++;
            }
        }
        if(count == arr.length){
            return true;
        }
        else{
            return false;
        }
	}

}
