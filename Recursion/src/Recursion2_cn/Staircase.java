package Recursion2_cn;

public class Staircase {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(staircase(n));

	}
    public static int staircase(int n){
       
        if(n == 0){
            return 1;
        }
        
        if(n == 1){
            return 1;
        }
        
        if(n == 2){
        	return 2;    
        }
 
        return staircase(n-1) + staircase(n-2) + staircase(n-3);
		
	}

}
