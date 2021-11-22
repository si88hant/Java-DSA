package Aditya_Verma_DP.MatrixChainMultiplication;

public class PalindromePartitioning_recursive {

	public static void main(String[] args) {
		String str = "ababbbabbababa";
	    System.out.println("Min cuts needed for " + "Palindrome Partitioning is " + minPalPartion(str, 0, str.length() - 1));

	}

	private static int minPalPartion(String str, int i, int j) {
		
		if(i >= j || isPalindrome(str, i, j)) {
			return 0;
		}
		
		int ans = Integer.MAX_VALUE;
		for(int k=i; k<=j-1; k++) {
			int temp_ans = 1 + minPalPartion(str, i, k) + minPalPartion(str, k+1, j);
			
			ans = Math.min(ans, temp_ans);
		}
		return ans;
		
	}

	private static boolean isPalindrome(String str, int i, int j) {
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
