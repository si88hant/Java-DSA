package Aditya_Verma_DP;

public class knapsack_01_recursive {

	public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(wt, val, W, n));
	}

	private static int knapSack(int[] wt, int[] val, int W, int n) {
		//base case
		if(n==0 || W==0) {
			return 0;
		}
		
		//choice diagram ka code
		if(wt[n-1] <= W) {
			return Math.max(val[n-1] + knapSack(wt, val, W-wt[n-1], n-1), knapSack(wt, val, W, n-1));
		}
		else {  // if(wt[n-1] > W)
			return knapSack(wt, val, W, n-1);  //i.e. we don't include this and move on
		}
	}

}
