import java.util.HashMap;

public class Extract_unique_characters {
	public static String uniqueChar(String str){
		
        HashMap<Character, Boolean> hm = new HashMap<>();
        
        String ans = "";
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(hm.containsKey(ch)){
                continue;
            }
            else{
                hm.put(ch, true);
                ans = ans + ch;
            }
        }
        return ans;
	}
}
