package Aditya_Verma_DP.LongestCommonSubsequence;

public class LongestCommonSubsequenceKiLength_recursive {

	public static void main(String[] args) {
		String x = "abcdgh";
		String y = "abedhr";
		
		int n = x.length();
		int m = y.length();
		
		System.out.println(LCS(x, y, n, m));

	}
	
	public static int LCS(String x, String y, int n, int m) {
		
		//base case
		if(n==0 || m==0) {
			return 0;
		}
		
		//choice diagram
		if(x.charAt(n-1) == y.charAt(m-1)) {
			return 1 + LCS(x, y, n-1, m-1);
		}
		else {
			return Math.max(LCS(x, y, n, m-1), LCS(x, y, n-1, m));
		}
	}

}
