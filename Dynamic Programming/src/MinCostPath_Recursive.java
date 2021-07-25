
public class MinCostPath_Recursive {

	public static void main(String[] args) {
		int arr[][] = {{1,1,1},{4,5,2},{7,8,9}};
		System.out.println(minCostPath(arr));
	}
	
	public static int minCostPath(int[][] arr) {
		return minCostPath(arr, 0, 0);
	}

	//min cost path from cell (i,j) to cell (i-1, j-1)
	public static int minCostPath(int[][] arr, int i, int j) {
		
		int m = arr.length;
		int n = arr[0].length;
		
		//base case
		if(i == m-1 && j == n-1) {
			return arr[i][j];
		}
		
		if(i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}
		
		int op1 = minCostPath(arr, i+1, j);
		int op2 = minCostPath(arr, i+1, j+1);
		int op3 = minCostPath(arr, i, j+1);
		
		return arr[i][j] + Math.min(op1, Math.min(op2, op3));
		
		
	}
	

}
