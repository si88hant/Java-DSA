
public class Check_number_in_array {

	public static boolean checkNumber(int input[], int x) {
        return checkNumber(input, x, 0);
	}
    
    public static boolean checkNumber(int input[], int x, int si){
        
        if(si > input.length-1){
            return false;
        }
        
        if(input[si] == x){
            return true;
        }
    
        return checkNumber(input, x, si+1);
    }	
	
}
