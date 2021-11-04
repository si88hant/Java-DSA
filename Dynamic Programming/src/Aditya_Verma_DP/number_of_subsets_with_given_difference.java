package Aditya_Verma_DP;

public class number_of_subsets_with_given_difference {

	public static void main(String[] args) {
		int arr[] = {1,1,2,3};  //given
		int diff = 1;  //given
		
		int sum = arraySum(arr);  //return sum of arr
		
		int s1 = (diff + sum)/2;   //see aditya verma video
		
		int ans = subsetSum(arr, s1);  //now the problem becomes "count of subset sum"
		
		System.out.println(ans);
	}
	
	public static int arraySum(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int subsetSum(int arr[], int s1) {
		int dp[][] = new int[arr.length+1][s1+1];
		
		for(int i=0; i<arr.length+1; i++) {
			dp[i][0] = 1;
		}
		
		for(int i=1; i<dp.length; i++) {
			for(int j=1; j<dp[0].length; j++) {
				if(j >= arr[i-1]) {
					dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[arr.length][s1];
	}
	
}
