package Aditya_Verma_DP.LongestCommonSubsequence;

public class ShortestCommonSuperSequenceKiLength {

	public static void main(String[] args) {
		String a = "AGGTAB";
		String b = "GXTXAYB";
		
		int m = a.length();
		int n = b.length();
		
		int dp[][] = new int[m+1][n+1];
		
		int lcs_len = LCS(a, b, m, n, dp);
		
		int output = m+n - lcs_len;
		System.out.println(output);
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
