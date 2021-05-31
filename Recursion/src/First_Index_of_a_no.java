
public class First_Index_of_a_no {
 /* Given an array of length N and an integer x, 
  * you need to find and return the first index of 
  * integer x present in the array. 
  * Return -1 if it is not present in the array. */
	
	public static int firstIndex(int input[], int x) {
		
        return firstIndex(input, x, 0);
        
	}
	public static int firstIndex(int input[], int x, int si){
        
        if(si > input.length-1){
            return -1;
        }
        
        if(input[si] == x){
            return si;
        }
        
        return firstIndex(input, x, si+1);
        
    }	
	
}
