package Aditya_Verma_DP;
import java.util.*;

public class minimum_subset_difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,6,11,5};
		int n = arr.length;
		
		int ans = MinSubsetDiff(arr, n);
		
		System.out.println(ans);

	}

	private static int MinSubsetDiff(int[] arr, int n) {
		int range = 0;
		for(int i=0; i<arr.length; i++) {
			range += arr[i];
		}
		
		ArrayList<Integer> v = isSubsetPoss(arr, n, range);
		
		int mn = Integer.MAX_VALUE;
		
		for(int i=0; i<v.size(); i++) {
			mn = Math.min(mn, Math.abs(range-2*v.get(i)));
		}
		return mn;
	}

	private static ArrayList<Integer> isSubsetPoss(int[] arr, int n, int sum) {
			boolean dp[][] = new boolean[n+1][sum+1];
			
			for(int i=0; i<n+1; i++) {
				dp[i][0] = true;
			}
			for(int i=1; i<dp.length; i++) {
				for(int j=0; j<dp[0].length; j++) {
					if(j >= arr[i-1]) {
						dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
					}
					else {
						dp[i][j] = dp[i-1][j];
					}
				}
			}
			
			ArrayList<Integer> v = new ArrayList<>();
			for(int j=0; j<sum+1; j++) {
				if(dp[n][j] == true) {
					v.add(j);
				}
			}
			
			return v;
	}

}
