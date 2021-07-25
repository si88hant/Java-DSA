
public class MinCostPath_Memoization {

	public static void main(String[] args) {	
		int arr[][] = {{1,1,1},{4,5,2},{7,8,9}};
		System.out.println(minCostPathM(arr));
	}
	
	public static int minCostPathM(int[][] arr) {
		
		int m = arr.length;
		int n = arr[0].length;
		
		int storage[][] = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				storage[i][j] = -1;
			}
		}
		
		return minCostPathM(arr, 0, 0, storage);
	}

	public static int minCostPathM(int[][] arr, int i, int j, int[][] storage) {
		
		int m = arr.length;
		int n = arr[0].length;
		
		if(i >= m || j >= n) {
			return Integer.MAX_VALUE;
		}
		
		//base case
		if(i == m-1 && j == n-1) {
			storage[m-1][n-1] = arr[i][j];
			return storage[i][j];
		}
		
		if(storage[i][j] != -1) {
			return storage[i][j];
		}
		
		int op1 = minCostPathM(arr, i+1, j, storage);
		int op2 = minCostPathM(arr, i+1, j+1, storage);
		int op3 = minCostPathM(arr, i, j+1, storage);
		
		storage[i][j] = arr[i][j] + Math.min(op1, Math.min(op2, op3));
		
		return storage[i][j];
	}

}
