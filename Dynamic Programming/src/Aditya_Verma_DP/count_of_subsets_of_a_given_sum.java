package Aditya_Verma_DP;

public class count_of_subsets_of_a_given_sum {

	public static void main(String[] args) {
		int arr[] = {2,3,5,6,8,10};
		int sum = 10;
		
		System.out.println(CountSubsets(arr, sum));
	}
	
	public static int CountSubsets(int[] arr, int sum) {
		int dp[][] = new int[arr.length+1][sum+1];
		
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				if(i == 0 && j == 0) {
					dp[i][j] = 1;
				}
				else if(i == 0) {
					dp[i][j] = 0;
				}
				else if(j == 0) {
					dp[i][j] = 1;
				}
			}
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(arr[i-1] <= j) {
					dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
				}
				else
					dp[i][j] = dp[i - 1][j];
			}
		}
		return dp[arr.length][sum];
	}

}
