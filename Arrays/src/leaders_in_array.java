// I did it on my own .. took 34 min 

import java.util.*;

public class leaders_in_array {
	
    static ArrayList<Integer> leaders(int arr[], int n){
  
        ArrayList<Integer> output = new ArrayList<>();
        
        if(n==1){
            output.add(arr[0]);
            return output;
        }
        
        for(int i=n-1; i>=0; i--){
            if(i == n-1){
                output.add(arr[i]);
            }
            else if(arr[i]>=output.get(output.size()-1)){
                output.add(arr[i]);
            }
        }
        
        // the elements in the arraylist are in reversed order of the expected result
        // now the goal is to reverse the arraylist
        
        Collections.reverse(output);
        
        
        /* the following reverse method isn't working here */
        // int lo = 0;                       
        // int hi = output.size()-1;         
       
        // while(lo < hi){
        //     int temp = output.get(lo);
        //     output.get(lo) = output.get(hi);
        //     output.get(hi) = temp;
        //  } 
        //     lo++;
        //     hi--;
        
        
        return output;
    }
}
