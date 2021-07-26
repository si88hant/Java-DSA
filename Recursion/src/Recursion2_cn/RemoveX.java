package Recursion2_cn;

public class RemoveX {

	public static void main(String[] args) {
		String str = "xxxqebu xxjx jidjk xx xk xs";
		System.out.println(removeX(str));
	}

	public static String removeX(String str) {

		if (str.length() == 0) {
			return str;
		}

		String ans = "";

		if (str.charAt(0) != 'x') {
			ans = ans + str.charAt(0);
		}

		String smallAns = removeX(str.substring(1));

		return ans + smallAns;
	}

}
