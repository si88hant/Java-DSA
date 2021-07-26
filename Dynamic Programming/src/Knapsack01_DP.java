
public class Knapsack01_DP {
	static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
		int[][] dp = new int[2][maxWeight + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= maxWeight; ++j) {
				if (weight[i] <= j) {
					dp[i % 2][j] = Math.max(value[i] + dp[(1 + i) % 2][j - weight[i]], dp[(i + 1) % 2][j]);
				} else {
					dp[i % 2][j] = dp[(i + 1) % 2][j];
				}
			}
		}
		return dp[(n + 1) % 2][maxWeight];
	}
}
