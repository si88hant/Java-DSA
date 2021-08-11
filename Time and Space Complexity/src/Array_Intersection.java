import java.util.Arrays;

public class Array_Intersection {

	public static void main(String[] args) {
		int arr1[] = {6,2,6,2,1,9,8};
		int arr2[] = {9,2,8,6,3};
		
		intersection(arr1, arr2);

	}
	public static void intersection(int[] arr1, int[] arr2) {
	   
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        
        int i = 0, j = 0;
        
        
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else if (arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        
	}

}
