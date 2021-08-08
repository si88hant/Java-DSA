import java.util.HashMap;
public class Array_Intersection {
	public static void intersection(int[] arr1, int[] arr2) {
		
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<arr1.length; i++){
            if(hm.containsKey(arr1[i])){
                hm.put(arr1[i], hm.get(arr1[i])+1);
            }
            else{
                hm.put(arr1[i], 1);
            }
        }
        
        for(int i=0; i<arr2.length; i++){
            if(hm.containsKey(arr2[i])){
                System.out.print(arr2[i] + " ");
            }
        }
        
	}
}
