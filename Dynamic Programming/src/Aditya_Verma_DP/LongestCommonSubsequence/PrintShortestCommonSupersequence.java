package Aditya_Verma_DP.LongestCommonSubsequence;

public class PrintShortestCommonSupersequence {

	public static void main(String[] args) {
		String a = "abac";
		String b = "cab";
		
		int m = a.length();
		int n = b.length();
		
		int dp[][] = new int[m+1][n+1];
		
		String ans = printSCS(a, b, m, n, dp);
		
		System.out.println(ans);

	}

	private static String printSCS(String a, String b, int m, int n, int[][] dp) {
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				dp[i][j] = 0;
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		int i = m;
		int j = n;
		String str = "";
		
		while(i>0 && j>0) {
			if(a.charAt(i-1) == b.charAt(j-1)) {
				str += a.charAt(i-1);
				i--;
				j--;
			}
			else {
				if(dp[i][j-1] > dp[i-1][j]) {
					str += b.charAt(j-1);
					j--;
				}
				else {
					str += a.charAt(i-1);
					i--;
				}
			}
		}
		
		while(i > 0) {
			str += a.charAt(i-1);
			i--;
		}
		while(j > 0) {
			str += b.charAt(j-1);
			j--;
		}
		
		//now reversing the string: str
		String ans = "";
		for(int k=str.length()-1; k>=0; k--) {
			ans += str.charAt(k);
		}
		
		return ans;
	}

}
