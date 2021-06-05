import java.util.HashMap;
public class max_freq_number {

	public static int maxFrequencyNumber(int[] arr){
        
        HashMap<Integer,Integer> check = new HashMap<>();
        
        for(int key:arr)
        {	if(check.containsKey(key))
            	check.put(key,check.get(key)+1);
            else
            check.put(key,1);
        }
        
        int maxx=Integer.MIN_VALUE;
        int number=arr[0];
        for(int key:arr)
        {
            if(check.get(key)>maxx)
            {   maxx=check.get(key);
                number=key;
        
            }        
        }           
        return number;
	}	
}
