package Recursion2_cn;

public class Remove_Duplicates {

	public static void main(String[] args) {
		String str = "nyyxxii";
		System.out.println(removeConsecutiveDuplicates(str));

	}
	public static String removeConsecutiveDuplicates(String s) {

        if(s.length() == 1){
            return s;
        }
        
        String ans = "";

        if(s.charAt(0)!= s.charAt(1)){
            ans = ans + s.charAt(0);
        }
        
        String smallAns = removeConsecutiveDuplicates(s.substring(1));
        
        return ans + smallAns;
	}

}
