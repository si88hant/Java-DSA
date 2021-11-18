package Aditya_Verma_DP.LongestCommonSubsequence;

public class SequencePatternMatching {

	public static void main(String[] args) {
		String a = "AXY";
		String b = "ADXCPY";

		int m = a.length();
		int n = b.length();
		
		int len_lcs = LCS(a, b, m, n);
		
		if(a.length() == len_lcs) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	private static int LCS(String a, String b, int m, int n) {
		int dp[][] = new int[m+1][n+1];
		
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
