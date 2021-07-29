
public class Is_string_palindrome {

	public static void main(String[] args) {
		String str = "racecar";
		boolean ans = isStringPalindrome(str);
		System.out.println(ans);
	}
	
	public static boolean isStringPalindrome(String input) {
        if(input.length()<=1){
            return true;
        }
        if(input.charAt(0) == input.charAt(input.length()-1)){
            return isStringPalindrome(input.substring(1, input.length()-1));
        }else{
            return false;
        }
	}

}
