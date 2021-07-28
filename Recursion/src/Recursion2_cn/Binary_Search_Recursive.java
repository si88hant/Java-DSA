package Recursion2_cn;

public class Binary_Search_Recursive {
	
	public static int binarySearch(int input[], int element) {
        return binarySearch(input, element, 0, input.length-1);
	}
    
    public static int binarySearch(int input[] , int element, int lo ,int hi){
        
        if(lo >= hi){
            return -1;
        }
             
        int mid = (lo+hi)/2;
        
        if(element == input[mid]){
            return mid;
        }
        
        else if(element > input[mid]){
            return binarySearch(input, element, mid+1, hi);
        }
        
        return binarySearch(input, element, lo, mid-1);   
    }
    
}

