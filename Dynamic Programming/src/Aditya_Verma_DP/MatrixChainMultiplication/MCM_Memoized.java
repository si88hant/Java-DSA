package Aditya_Verma_DP.MatrixChainMultiplication;

public class MCM_Memoized {

	public static void main(String[] args) {
		int arr[] = {40, 20, 30, 10, 30};
		
		int i = 1;
		int j = arr.length-1;
		
		int dp[][] = new int[1001][1001];
		
		for(int x=0; x<1001; x++) {
			for(int y=0; y<1001; y++) {
				dp[i][j] = -1;
			}
		}
		
		int ans = solve(arr, i, j, dp);
		System.out.println(ans);

	}

	private static int solve(int[] arr, int i, int j, int[][] dp) {
		
		//base case
		if(i >= j) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		int min = Integer.MAX_VALUE;
		for(int k = i; k <= j-1; k++) {
			int tempAns = solve(arr, i, k, dp) + solve(arr, k+1, j, dp) + arr[i-1]*arr[j]*arr[k];
			
			min = Math.min(min, tempAns);
		}
		dp[i][j] = min;
		return min;
	}

}
