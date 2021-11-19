package Aditya_Verma_DP.MatrixChainMultiplication;

public class MCM_recursive {

	public static void main(String[] args) {
		int arr[] = {40, 20, 30, 10, 30};
		
		int i = 1;
		int j = arr.length-1;
		
		int ans = solve(arr, i, j);
		System.out.println(ans);

	}

	private static int solve(int[] arr, int i, int j) {
		
		//base case
		if(i >= j) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int k=i; k<=j-1; k++) {
			int tempAns = solve(arr, i, k) + solve(arr, k+1, j) + (arr[i-1]*arr[k]*arr[j]);
			
			if(tempAns < min) {
				min = tempAns;
			}
		}
		
		return min;
	}

}
