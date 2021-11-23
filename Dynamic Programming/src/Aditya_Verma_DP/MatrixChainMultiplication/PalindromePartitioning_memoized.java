package Aditya_Verma_DP.MatrixChainMultiplication;

public class PalindromePartitioning_memoized {

	public static void main(String[] args) {
		String str = "ababbbabbababa";
		
		int dp[][] = new int[str.length()][str.length()];
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		
	    System.out.println("Min cuts needed for " + "Palindrome Partitioning is " + minPalPartion(str, 0, str.length() - 1, dp));

	}
	
	private static int minPalPartion(String str, int i, int j, int[][] dp) {
		
		if(i >= j || isPalindrome(str, i, j)) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		int ans = Integer.MAX_VALUE;
		for(int k=i; k<=j-1; k++) {
			int temp_ans = 1 + minPalPartion(str, i, k, dp) + minPalPartion(str, k+1, j, dp);
			
			ans = Math.min(ans, temp_ans);
		}
		dp[i][j] = ans;
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
