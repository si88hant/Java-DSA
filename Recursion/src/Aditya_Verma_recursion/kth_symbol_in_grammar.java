package Aditya_Verma_recursion;

public class kth_symbol_in_grammar {

    public int kthGrammar(int n, int k) {
        if(n == 1 && k == 1){
            return 0;
        }
        
        int row_length = (int)Math.pow(2, n-1);
        int mid = row_length/2;
        
        if(k <= mid){
            return kthGrammar(n-1,k);
        }
        else{
            if(kthGrammar(n-1,k-mid) == 0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
	
}
