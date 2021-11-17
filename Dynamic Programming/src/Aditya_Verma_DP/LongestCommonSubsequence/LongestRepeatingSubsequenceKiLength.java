package Aditya_Verma_DP.LongestCommonSubsequence;

public class LongestRepeatingSubsequenceKiLength {

	public static void main(String[] args) {
		String a = "AABEBCDD";
		int ans = LRS(a);
		System.out.println(ans);
	}
	
	public static int LRS(String a) {
		String b = a;
	//	System.out.println(b);
		return LCS(a, b);
		
	}

	private static int LCS(String a, String b) {
		int dp[][] = new int[a.length()+1][b.length()+1];
		
		for(int i=1; i<a.length()+1; i++) {
			for(int j=1; j<b.length()+1; j++) {
				if(a.charAt(i-1) == b.charAt(j-1) && i!=j) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[a.length()][b.length()];
	}

}
