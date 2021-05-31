
public class Last_Index_of_a_no {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        return lastIndex(input,x,0);
	}
    
    public static int lastIndex(int input[], int x, int si){  
        
        if(si > input.length-1){    //BASE CASE
            return -1;                   
        }
        
        
    //Sumit Malik Pepcoding solution
       int li_sa = lastIndex(input, x, si+1);
        
        if(li_sa == -1){
            if(input[si] == x){
                return si;
            }else{
                return -1;
            }
        }
        else{
            return li_sa;
        }
    }	
	
}
