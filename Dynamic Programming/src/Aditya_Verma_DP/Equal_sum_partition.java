package Aditya_Verma_DP;

public class Equal_sum_partition {

	public static void main(String[] args) {
		int arr[] = {1,5,11,5};
		boolean ans = EqualSumPartitionPossible(arr);
		
		System.out.println(ans);
	}
	
	public static boolean EqualSumPartitionPossible(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		if(sum%2 != 0) {  // if sum is odd
			return false;
		}
		else {
			return isSubsetPoss(arr, sum/2); 
		}
	}
	
	public static boolean isSubsetPoss(int arr[], int sum) {
		boolean dp[][] = new boolean[arr.length+1][sum+1];
		
		//initialization
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				if(i==0 && j==0) {
					dp[i][j] =true;
				}
				else if(i == 0) {
					dp[i][j] = false;
				}
				else if(j == 0) {
					dp[i][j] =true;
				}
				else {
					if(dp[i-1][j] == true) {
						dp[i][j] =true;
					}
					else {
						int val = arr[i-1];
						if(j >= val) {
							if(dp[i-1][j-val] == true) {
								dp[i][j] = true;
							}
						}
					}
				}
			}
		}
		return dp[arr.length][sum];
	}

}
