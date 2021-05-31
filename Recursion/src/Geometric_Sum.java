
public class Geometric_Sum {

	/* Given k, find the geometric sum i.e.
	 * 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)  */
	
	public static double findGeometricSum(int k){        
        return findGeometricSum(k,0);
	}
    
    public static double findGeometricSum(int k, int si){
        
        if(k == si){
            return 1/(Math.pow(2,si)) ; 
        }
    
        
        return 1/(Math.pow(2,si))  + findGeometricSum(k , si+1);
        
    }	
	
}
