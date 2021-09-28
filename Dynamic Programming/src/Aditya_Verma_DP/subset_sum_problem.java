package Aditya_Verma_DP;

public class subset_sum_problem {

	public static void main(String[] args) {
		int arr[] = {2,3,7,8,10};
		int sum = 11;
		
		boolean dp[][] = new boolean[arr.length+1][sum+1];
		
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				if(i == 0 && j == 0) {
					dp[i][j] = true;
				}
				else if(i == 0) {
					dp[i][j] = false;
				}
				else if(j == 0) {
					dp[i][j] = true;
				}
				else {
					if(dp[i-1][j] == true) {
						dp[i][j] = true;
					}
					else {
						int val = arr[i-1];
						if(j >= val) {
							if(dp[i-1][j-val] == true) {
								dp[i][j] =true;
							}
						}
					}
				}
			}
		}
		System.out.println(dp[arr.length][sum]);
	}
	
}
