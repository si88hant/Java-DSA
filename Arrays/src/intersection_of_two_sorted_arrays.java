
public class intersection_of_two_sorted_arrays {

    public static void main(String args[])
    {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        printIntersection(arr1, arr2, m, n);
    }
    
    public static void printIntersection(int arr1[], int arr2[], int m, int n) {
    	
    	int i=0, j=0;
    	while(i < m && j < n) {
    		if(arr1[i] == arr2[j]) {
    			System.out.print(arr1[i] + " ");
    			i++;
    			j++;
    		}
    		else if(arr1[i] < arr2[j]) {
    			i++;
    		}
    		else if(arr2[j] < arr1[i]) {
    			j++;
    		}
    	}
    	
    }

	
}
