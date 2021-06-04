import java.util.HashMap;
import java.util.Set; // Included only for iteration. Because keySet() return  all the keys in the data type 'Set' 

public class Inbuilt_Hashmaps {
	
	public static void main (String[] args) {
		HashMap<String, Integer> MyMap = new HashMap<>();
		
		//insert
		MyMap.put("abc" , 1);
		MyMap.put("def" , 2);
		MyMap.put("abc1" , 1);
		MyMap.put("def1" , 2);
		
		System.out.println("Size: " + MyMap.size());
		
		
		//Check Presence
		if(MyMap.containsKey("abc")) {              //O(1)
			System.out.println("Has abc");
		}
		if(MyMap.containsKey("abc1")) {              //O(1)
			System.out.println("Has abc1");
		}
		if(MyMap.containsValue(2)) {                  //O(n)
			System.out.println("Has 2 as a value");
		}
		
		
		//Get Value
		int v = 0;
		if(MyMap.containsKey("banana")) {
			v = MyMap.get("banana");
		}
		System.out.println(v);
		
		//Remove
		int s = MyMap.remove("abc");
		System.out.println(s);
		
		
		//Iterate
		Set<String> keys = MyMap.keySet();     //keySet() returns all the keys in data type 'Set'
		for(String x: keys) {
			System.out.println(x);
		}
	}
	
}
