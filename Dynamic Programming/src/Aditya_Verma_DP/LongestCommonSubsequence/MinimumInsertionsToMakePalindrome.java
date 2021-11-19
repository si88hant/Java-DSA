package Aditya_Verma_DP.LongestCommonSubsequence;

public class MinimumInsertionsToMakePalindrome {

	public static void main(String[] args) {
		String a = "aebcbda";
		
		int min_ins = a.length() - LPS(a);
		System.out.println(min_ins);

	}

	private static int LPS(String a) {
		String b = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			b += a.charAt(i);
		}
		
		int m = a.length();
		int n = b.length();
		
		int dp[][] = new int[m+1][n+1];
		
		int lcs_len = LCS(a, b, m, n, dp);
		return lcs_len;
		
	}

	private static int LCS(String a, String b, int m, int n, int[][] dp) {
		
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}

}
