package Aditya_Verma_DP.LongestCommonSubsequence;

public class PrintLongestCommonSubsequence {

	public static void main(String[] args) {
		String x = "acbcf";
		String y = "abcdaf";
		
		int m = x.length();
		int n = y.length();
		
		int dp[][] = new int[m+1][n+1];
		
		System.out.println(printLCS(x, y, m, n, dp));

	}

	private static String printLCS(String x, String y, int m, int n, int[][] dp) {
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
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		String s = "";
		int i = m;
		int j = n;
		
		while(i>0 && j>0) {
			if(x.charAt(i-1) == y.charAt(j-1)) {
				s += x.charAt(i-1);
				i--;
				j--;
			}
			else {
				if(dp[i][j-1] > dp[i-1][j]) {
					j--;
				}
				else {
					i--;
				}
			}
		}
		
		//now we need to reverse the string s
		String ans = "";
		
		for(int k = s.length()-1; k>=0; k--) {
			ans += s.charAt(k);
		}
		
		return ans;
	}

}
