package Aditya_Verma_DP.LongestCommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubsequenceKiLength_memoized {

	public static void main(String[] args) {
		String x = "abcdgh";
		String y = "abedhr";
		
		int n = x.length();
		int m = y.length();
		
		int dp[][] = new int[n+1][m+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<m+1; j++) {
				dp[i][j] = -1;
			}
		}
		
		System.out.println(LCS(x, y, n, m, dp));

	}
	public static int LCS(String x, String y, int n, int m, int[][] dp) {
		
		if(n==0 || m==0) {
			return 0;
		}
		
		if(dp[n][m] != -1) {
			return dp[n][m];
		}
		
		if(x.charAt(n-1) == y.charAt(m-1)) {
			dp[n][m] = 1 + LCS(x, y, n-1, m-1, dp);
		}
		else {
			dp[n][m] = Math.max(LCS(x, y, n-1, m, dp), LCS(x, y, n, m-1, dp));
		}
		
		return dp[n][m];
	}
}
