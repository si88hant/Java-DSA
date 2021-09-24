
public class replace_character_recursively {

	public static void main(String[] args) {
		String str = "abxxcxxa";
		
		String op = remove(str);
		System.out.println(op);
	}

	private static String remove(String str) {
		if(str.length() == 0) {
			return str;
		}
		
		String ans = "";
		if(str.charAt(0) != 'x') {
			ans += str.charAt(0);
		}
		String smallAns = remove(str.substring(1));
		
		return ans + smallAns;
	}

}
