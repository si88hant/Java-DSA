package Aditya_Verma_DP.LongestCommonSubsequence;

public class LongestCommonSubstringKiLength {

	public static void main(String[] args) {
		String x = "abcde";
		String y = "abfce";
		
		int m = x.length();
		int n = y.length();
		
		int dp[][] = new int[m+1][n+1];
		
		System.out.println(LCS(x, y, m, n, dp));

	}

	private static int LCS(String x, String y, int m, int n, int[][] dp) {
		
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = 0;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				max = Math.max(max, dp[i][j]);
			}
		}
		return max;
	}

}
